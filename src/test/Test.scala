package test

import evaluator.Evaluator.eval
import parser.AbstractParser.analyze
import pcf.PCF.main

import java.io.ByteArrayInputStream

// (programme, résultat attendu) ; "erreur" quand une exception est attendue
val bleu = List(
  "let x = 1 in x + 1" -> "2",
  "let x = 1 in y" -> "erreur",
  "let x = 1 in let y = 2 in x + y" -> "3",
  "let x = 1 in let x = 2 in x" -> "2",
  "let x = 1 in let x = x + 1 in x" -> "2",
  "let x = 1 in (let x = 2 in x) + x" -> "3",
  "let x = (let y = 1 in y) in y" -> "erreur",
  "let cond = ifz 4 - 2 then 3 - 2 * 2 else 1 in 2 / cond" -> "2",
)

val rouge = List(
  "fun x -> 0" -> "<fun>",
  "(fun x -> 0) + 1" -> "erreur",
  "(fun x -> 0) 1" -> "0",
  "(fun x -> x + 1) 1" -> "2",
  "let zero = fun x -> 0 in zero 1" -> "0",
  "(fun y -> let x = 1 in x + 1) 41" -> "2",
  "(fun x -> fun y -> x + y) 2 41" -> "43",
  "let minus = fun x -> fun y -> x - y in let g = minus 68 in g 2" -> "66",
  "let id = fun x -> x in let inc = fun x -> x + 1 in id (inc 76)" -> "77",
  // variable libre : f garde le a de sa définition
  "let a = 10 in let f = fun x -> x + a in let a = 100 in f 1" -> "11",
)

@main
def test(): Unit =
  val results = for (program, expected) <- bleu ++ rouge yield
    println(s"--- $program")
    val result =
      try eval(analyze(ByteArrayInputStream(program.getBytes)), Map()).toString
      catch case e: Exception =>
        println(s"exception : ${e.getMessage}")
        "erreur"
    val ok = result == expected
    println(s"==> $result ${if ok then "OK" else s"ÉCHEC (attendu : $expected)"}")
    ok
  println(s"\n${results.count(identity)}/${results.size} tests réussis")

// pour tester un fichier
def test(file: String): Unit =
  val args = Array(file)
  main(args)
