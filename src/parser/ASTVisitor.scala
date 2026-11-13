package parser

import ast.*
import ast.Term.*

import scala.jdk.CollectionConverters.*

//parcours chaques noeuds d'un arbre pour les transformer en syntaxe abstraite 
// NUMBER(1) -> unité lexicale
// Number(1) -> construction syntaxique AST
// context -> API ANTLR noeud de l'arbre syntaxique

class ASTVisitor extends PCFBaseVisitor[Term] :

  override def visitNumber(ctx: PCFParser.NumberContext): Term =
    Number(ctx.getText.toInt)

  override def visitFromSum(ctx: PCFParser.FromSumContext): Term =
    visit(ctx.sum)

  override def visitSumTerm(ctx: PCFParser.SumTermContext): Term =
    visit(ctx.product)

  override def visitBinaryExp1(ctx: PCFParser.BinaryExp1Context): Term =
    val s = ctx.OP1().getText
    val op = Op.parse(s)
    BinaryExpression(op, visit(ctx.product), visit(ctx.application))

  override def visitProductTerm(ctx: PCFParser.ProductTermContext): Term =
    visit(ctx.application)

  override def visitBinaryExp2(ctx: PCFParser.BinaryExp2Context): Term =
    val s = ctx.OP2().getText
    val op = Op.parse(s)
    BinaryExpression(op, visit(ctx.sum), visit(ctx.product))

  override def visitApplicationTerm(ctx: PCFParser.ApplicationTermContext): Term =
    visit(ctx.atom)

  override def visitParExp(ctx: PCFParser.ParExpContext): Term =
    visit(ctx.exp)

  override def visitIfZero(ctx: PCFParser.IfZeroContext): Term =
    val concreteExps = ctx.exp.asScala.toList
    val List(exp1, exp2, exp3) =
      for (concreteExp <- concreteExps) yield
        visit(concreteExp)
    IfZero(exp1, exp2, exp3)

  override def visitVar(ctx: PCFParser.VarContext): Term =
    Var(ctx.VAR().getText)
    
  override def visitLet(ctx: PCFParser.LetContext): Term =
    Let(ctx.VAR().getText, visit(ctx.exp(0)), visit(ctx.exp(1)))

  override def visitFun(ctx: PCFParser.FunContext): Term =
    Fun(ctx.VAR().getText, visit(ctx.exp))

  override def visitFix(ctx: PCFParser.FixContext): Term =
    Fix(ctx.VAR().getText, visit(ctx.exp))

  override def visitApp(ctx: PCFParser.AppContext): Term =
    App(visit(ctx.application), visit(ctx.atom))
