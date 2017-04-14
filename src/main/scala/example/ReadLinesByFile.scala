package example

import scala.io.Source

/**
  * Description: 命令行执行不了，why
  * Version:v1.0
  * Created by leal 
  * on 4/14/17:1:23 PM.
  */
object ReadLinesByFile {
  def main(args: Array[String]): Unit = {
    def widthOfLength(s: String) = s.length.toString.length
    if (args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines.toList
      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)
      for (line <- lines) {
        val numSpaces = maxWidth-widthOfLength(line)
        val padding = " " * numSpaces
        print(padding + line.length +" | "+ line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }
}
