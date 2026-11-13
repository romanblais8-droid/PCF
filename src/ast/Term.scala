package ast

enum Term:
  case Number(value: Int)
  case BinaryExpression(op: Op, term1: Term, term2: Term)
  case IfZero(test: Term, term1: Term, term2: Term)
  case Var(id:String)
  case Let(name : String, t1: Term, t2: Term)
  case Fun(x: String, term : Term)
  case App(term1: Term, term2: Term)
  case Fix(name: String, term1: Term, term2: Term)

enum Op:
  case Plus, Minus, Multiply, Divide

enum Value :
  case intVal(i: Int)
  case closure(x: String, t: Term, e: Map[String, Value])

object Op:
  def parse(op: String): Op = op match
    case "+" => Plus
    case "-" => Minus
    case "*" => Multiply
    case "/" => Divide
    case _ => ???

