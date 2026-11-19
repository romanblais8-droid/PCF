package pcf
///
import evaluator.Evaluator.eval
import parser.AbstractParser.analyze

import java.io.{FileInputStream, InputStream}

object PCF:
  def main(args: Array[String]): Unit =
    val in: InputStream =
      if args.isEmpty then
        System.in
      else
        FileInputStream(args(0))

    val term = analyze(in)
    val typ = typer.Typer.eval(term, Map())
    println(s"==> ${eval(term, Map())}: $typ")
