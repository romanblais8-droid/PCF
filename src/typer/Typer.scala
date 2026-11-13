package typer

import ast.Term
import Term.*

object Typer :
  type Env = Map[String, Type]
  def eval(term: Term, e: Env): Type = term match
    
    case Number(_) => INT
    
    case IfZero(t1, t2, t3) =>
      val A = eval(t1, e)
      val B = eval(t2, e)
      val C = eval(t3, e)
      if A === INT && B === C then B
      else throw TypeError(term.toString)
      
    case BinaryExpression(op, t1, t2) =>
      val A = eval(t1, e)
      val B = eval(t2, e)
      if A === B && B === INT then B
      else throw TypeError(term.toString)

    case Var(id) =>
      e.getOrElse(id, throw TypeError(s"Variable non définie: $id"))

    case Let(name, t1, t2) =>
      val valueType = eval(t1, e)
      eval(t2, e.updated(name, valueType))

    ///case Fun(x, term) => FUNCTION

    ///case App(e1, e2) =>
          
    case _ => ???
