package example

/**
  * Description:函数式编程
  * Version:v1.0
  * Created by leal 
  * on 4/14/17:1:01 PM.
  */
object Functions {
  def main(args: Array[String]): Unit = {
    val testString= Array("zero", "one", "two")
    testFor(testString)
  }

  /**
    * 没有副作用或 var 的函数
    * @param args
    * @return
    */
  def formatArgs(args: Array[String]) = args.mkString("\n")

  def testFor(string: Array[String])={
    string.mkString("->").foreach(str=>print(str))
    println()
    for(str<-string.mkString("--")){
      print(str)
    }
  }



}
