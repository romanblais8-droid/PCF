package parser

import ast.Exp

import java.io.InputStream

object AbstractParser :
  def analyze(in: InputStream): Exp =
    val concreteTree = ConcreteParser.analyze(in)
    val visitor = new ASTVisitor
    val exp = visitor.visit(concreteTree).asInstanceOf[Exp]
    println(s"AST: $exp")
    exp
