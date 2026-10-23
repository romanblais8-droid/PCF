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

  override def visitBinaryExp1(ctx: PCFParser.BinaryExp1Context): Term =
    val s = ctx.OP1().getText
    val op = Op.parse(s)
    // ctx.term is a Java list, it is translated in a Scala list
    // (initially, to an instance of Buffer, using a collection
    // converter, as Java lists are mutable)
    val concreteExps = ctx.exp.asScala.toList
    val List(exp1, exp2) =
      for (concreteExp <- concreteExps) yield
        visit(concreteExp)
    BinaryExpression(op, exp1, exp2)

  override def visitBinaryExp2(ctx: PCFParser.BinaryExp2Context): Term =
    val s = ctx.OP2().getText
    val op = Op.parse(s)
    val concreteExps = ctx.exp.asScala.toList
    val List(exp1, exp2) =
      for (concreteExp <- concreteExps) yield
        visit(concreteExp)
    BinaryExpression(op, exp1, exp2)

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
