package pcf

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
    val exp = analyze(in)
    println(s"==> ${eval(exp)}")
