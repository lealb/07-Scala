package example

import org.apache.spark.SparkConf

/**
  * Scala 的发音是 skah-la
  * Description:测试基础
  * Version:v1.0
  * Created by leal 
  * on 4/13/17:2:29 PM.
  */
object Test {
  def main(args: Array[String]): Unit = {
//    testMap()
    print(factorial(10))
    val conf=new SparkConf();
  }

  /**
    * 测试map
    */
  def testMap()={
    var capital = Map("US"->"Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }

  /**
    * 阶层
    * @param x
    * @return
    */
  def factorial(x: BigInt): BigInt ={
    if (x == 0) 1 else x * factorial(x - 1)
  }




}
