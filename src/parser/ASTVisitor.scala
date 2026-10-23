package parser

import ast.*
import ast.Exp.*

import scala.jdk.CollectionConverters.*

//parcours chaques noeuds d'un arbre pour les transformer en syntaxe abstraite 
// NUMBER(1) -> unité lexicale
// Number(1) -> construction syntaxique AST
// context -> API ANTLR noeud de l'arbre syntaxique

class ASTVisitor extends PCFBaseVisitor[Exp] :

  override def visitNumber(ctx: PCFParser.NumberContext): Exp =
    Number(ctx.getText.toInt)

  override def visitBinaryExp1(ctx: PCFParser.BinaryExp1Context): Exp =
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

  override def visitBinaryExp2(ctx: PCFParser.BinaryExp2Context): Exp =
    val s = ctx.OP2().getText
    val op = Op.parse(s)
    val concreteExps = ctx.exp.asScala.toList
    val List(exp1, exp2) =
      for (concreteExp <- concreteExps) yield
        visit(concreteExp)
    BinaryExpression(op, exp1, exp2)

  override def visitParExp(ctx: PCFParser.ParExpContext): Exp =
    visit(ctx.exp)

  override def visitIfZero(ctx: PCFParser.IfZeroContext): Exp =
    val concreteExps = ctx.exp.asScala.toList
    val List(exp1, exp2, exp3) =
      for (concreteExp <- concreteExps) yield
        visit(concreteExp)
    IfZero(exp1, exp2, exp3)
