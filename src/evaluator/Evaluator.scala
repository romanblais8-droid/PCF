package evaluator

import ast.Term
import Term.*
import ast.Op

object Evaluator :
  def eval(term: Term, e: Map[String, Int]): Int = term match
    
    case Number(value) => value
    
    case IfZero(t, e1, e2) => 
      if eval(t, e) == 0 then eval(e1, e) else eval(e2, e)
    
    case BinaryExpression(op, e1, e2) =>
      val v1 = eval(e1, e)
      val v2 = eval(e2, e)
      op match
        case Op.Plus => v1 + v2
        case Op.Minus => v1 - v2
        case Op.Multiply => v1 * v2
        case Op.Divide =>
          if v2 == 0 then throw new ArithmeticException("division par zéro")
          else v1 / v2

    case Var(id) =>
      e.getOrElse(id, throw new NoSuchElementException(s"Variable non définie: $id"))

    case Let(name, e1, e2) =>
      val value = eval(e1, e)
      eval(e2, e.updated(name, value))
