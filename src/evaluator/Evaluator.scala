package evaluator

import ast.Exp
import Exp.*
import ast.Op

object Evaluator :
  def eval(exp: Exp): Int = exp match
    case Number(value) => value
    case IfZero(t, e1, e2) => 
      if eval(t) == 0 then eval(e1) else eval(e2)
      
    case BinaryExpression(op, e1, e2) =>
      val v1 = eval(e1)
      val v2 = eval(e2)
      op match
        case Op.Plus => v1 + v2
        case Op.Minus => v1 - v2
        case Op.Multiply => v1 * v2
        case Op.Divide =>
          if v2 == 0 then throw new ArithmeticException("division par zéro")
          else v1 / v2

