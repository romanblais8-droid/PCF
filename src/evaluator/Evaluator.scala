package evaluator

import ast.Term
import Term.*
import ast.Op

// valeurs : entiers ou fermetures (fonction + environnement de définition)
enum Value:
  case IntValue(n: Int)
  case Closure(param: String, body: Term, env: Env)

  override def toString: String = this match
    case IntValue(n) => n.toString
    case Closure(_, _, _) => "<fun>"

type Env = Map[String, Value]

import Value.*

object Evaluator :
  def eval(term: Term, e: Env): Value = term match

    case Number(value) => IntValue(value)

    case IfZero(t, e1, e2) =>
      if evalInt(t, e) == 0 then eval(e1, e) else eval(e2, e)

    case BinaryExpression(op, e1, e2) =>
      val v1 = evalInt(e1, e)
      val v2 = evalInt(e2, e)
      op match
        case Op.Plus => IntValue(v1 + v2)
        case Op.Minus => IntValue(v1 - v2)
        case Op.Multiply => IntValue(v1 * v2)
        case Op.Divide =>
          if v2 == 0 then throw new ArithmeticException("division par zéro")
          else IntValue(v1 / v2)

    case Var(id) =>
      e.getOrElse(id, throw new NoSuchElementException(s"Variable non définie: $id"))

    case Let(name, e1, e2) =>
      val value = eval(e1, e)
      eval(e2, e.updated(name, value))

    // la fonction capture l'environnement courant (variables libres)
    case Fun(param, body) =>
      Closure(param, body, e)

    // appel par valeur : on évalue d'abord l'argument, puis la fonction
    case App(t1, t2) =>
      val arg = eval(t2, e)
      eval(t1, e) match
        case Closure(param, body, env) => eval(body, env.updated(param, arg))
        case v => throw new RuntimeException(s"$v n'est pas une fonction")

  private def evalInt(term: Term, e: Env): Int = eval(term, e) match
    case IntValue(n) => n
    case v => throw new RuntimeException(s"$v n'est pas un entier")
