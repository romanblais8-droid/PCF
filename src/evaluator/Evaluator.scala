package evaluator

import ast.*
import Term.*
import ast.Op

object Evaluator :
  given int2Val: Conversion[Int, Value] = n => Value.intVal(n)
  given val2Int: Conversion[Value, Int] =
    case Value.intVal(n) => n
    case _ => throw new IllegalArgumentException("Une valeur non entière est utilisée comme entier")

  def eval(term: Term, e: Map[String, Value]): Value = term match
    
    case Number(value) => Value.intVal(value)
    
    case IfZero(t, e1, e2) => 
      if eval(t, e) == Value.intVal(0) then eval(e1, e) else eval(e2, e)
    
    case BinaryExpression(op, e1, e2) =>
      val v1 = eval(e1, e)
      val v2 = eval(e2, e)
      op match
        case Op.Plus => v1 + v2
        case Op.Minus => v1 - v2
        case Op.Multiply => v1 * v2
        case Op.Divide =>
          if v2 == Value.intVal(0) then throw new ArithmeticException("division par zéro")
          else v1 / v2

    case Var(id) =>
      e.getOrElse(id, throw new NoSuchElementException(s"Variable non définie: $id"))

    case Let(name, e1, e2) =>
      val value = eval(e1, e)
      eval(e2, e.updated(name, value))

    case Fun(x, term) =>
      Value.closure(x, term, e)

    case App(e1, e2) =>
      val arg = eval(e2, e)
      eval(e1, e) match
        case Value.closure(x, t, closureEnv) => eval(t, closureEnv.updated(x, arg))
        case v => throw new RuntimeException(s"$v n'est pas une fonction")