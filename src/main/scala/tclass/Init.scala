package tclass

/**
  * Description: 测试主方法
  * Version:v1.0
  * Created by leal 
  * on 4/14/17:1:35 PM.
  */
object Init {
  def main(args: Array[String]): Unit = {
//    val acc=new ChecksumAccumulator
//    println(acc.add(10))
//    println(acc.checksum())

    val r1=new Rational(3,5);
    val r2=new Rational(6,9);
    println(r2)
    println(r1*r2)
    println(r1+r2)
    /**
      * 隐式转换
      * 这是就不需要定义两套方法啦
      * @param x
      * @return
      */
    implicit def intToRational(x: Int) = new Rational(x)
    println(2*r1)

    println(gcd(3,9))


  }

  /**
    * 递归 使其更函数化
    * @param x
    * @param y
    * @return
    */
  def gcd(x: Long, y: Long): Long =
    if (y == 0) x else gcd(y, x % y)
}
