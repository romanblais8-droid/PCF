package evaluator

import ast.Term

enum Value:
  case intVal(i: Int)
  case closure(x: String, term: Term, env: Env)

case class IceCube(x: String, term: Term, env: Env)

type Env = Map[String, Value | IceCube]
