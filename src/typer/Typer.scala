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
    case _ => ???
