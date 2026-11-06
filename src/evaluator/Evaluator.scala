package evaluator

import ast.Term
import Term.*
import ast.Op

import scala.language.implicitConversions

class InterpretationException(msg: String) extends Exception(msg)

// une valeur est soit un entier, soit une fermeture (fonction + environnement de définition)
enum Value:
  case IntVal(n: Int)
  case Closure(x: String, t: Term, e: Evaluator.Env)

  override def toString: String = this match
    case IntVal(n) => n.toString
    case Closure(_, _, _) => "<fun>"

import Value.*

object Evaluator :
  type Env = Map[String, Value]

  // emballage / déballage implicites des entiers
  given int2Val: Conversion[Int, Value] = n => IntVal(n)
  given val2Int: Conversion[Value, Int] =
    case IntVal(n) => n
    case v => throw InterpretationException(s"$v n'est pas un entier")

  def eval(t: Term, e: Env): Value = t match

    case Number(value) => value

    case IfZero(test, t1, t2) =>
      val n: Int = eval(test, e)
      if n == 0 then eval(t1, e) else eval(t2, e)

    case BinaryExpression(op, t1, t2) =>
      val v1: Int = eval(t1, e)
      val v2: Int = eval(t2, e)
      op match
        case Op.Plus => v1 + v2
        case Op.Minus => v1 - v2
        case Op.Multiply => v1 * v2
        case Op.Divide => v1 / v2 // division par zéro : ArithmeticException levée par Scala

    case Var(id) =>
      e.getOrElse(id, throw InterpretationException(s"variable non définie : $id"))

    case Let(id, t1, t2) =>
      eval(t2, e + (id -> eval(t1, e)))

    case Fun(x, body) =>
      Closure(x, body, e)

    // appel par valeur : on évalue d'abord l'argument, puis la fonction
    case App(t1, t2) =>
      val arg = eval(t2, e)
      eval(t1, e) match
        case Closure(x, body, e1) => eval(body, e1 + (x -> arg))
        case v => throw InterpretationException(s"$v n'est pas une fonction")
