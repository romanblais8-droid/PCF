package ast

enum Term:
  case Number(value: Int)
  case BinaryExpression(op: Op, term1: Term, term2: Term)
  case IfZero(test: Term, term1: Term, term2: Term)
  case Var(id:String)
  case Let(name : String, t1: Term, t2: Term)

enum Op:
  case Plus, Minus, Multiply, Divide

object Op:
  def parse(op: String): Op = op match
    case "+" => Plus
    case "-" => Minus
    case "*" => Multiply
    case "/" => Divide
    case _ => ???

