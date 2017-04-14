package example

/**
  * Scala 的发音是 skah-la
  * Description:测试基础
  * Version:v1.0
  * Created by leal 
  * on 4/13/17:2:29 PM.
  */
object Test {
  def main(args: Array[String]): Unit = {
//    print(factorial(10))
//    testWhile("wertrytr")
    val strs="I am a student"
//    strs.foreach(str=>print(str+"->"))
//    println()
    for(str<-strs){
      print(str)
    }
//    println()
//    testArray()
//    testList()
//    testTuple()
    testSet()
    testMap()
    print(multiTable())
  }

  /**
    * while 逆序
    *
    * @param str
    */
  def testWhile(str: String) = {
    var i = str.length - 1
    while (i > -1) {
      if (i != str.length - 1)
        print("->")
      print(str(i))
      i -= 1
    }
  }

  /**
    * 阶层
    * @param x
    * @return
    */
  def factorial(x: BigInt): BigInt = {
    if (x == 0) 1 else x * factorial(x - 1)
  }

  def testArray() = {
    val str = new Array[String](3)
    str(0) = "we"
    str(1) = "qw"
    str(2) = "tr"
    for (i <- 0 to str.length - 1) {
      println(str(i))
    }

  }

  def testList() = {
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1 ::: list2
    val list4 = 0 :: list3
    println("list3->" + list3 + "\nlist4->" + list4)
    val list5 = 1 :: 2 :: 3 :: Nil
    println("list5->"+list5)
  }

  def testTuple()={
    val tuple1=(1,'a',"am",true)
    print("tuple1->"+tuple1+"\ntuple1last->"+tuple1._4)
  }

  /**
    * hashSet->Set
    */
  def testSet()={
    //默认 scala.collection.immutable.Set 不可变
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))
    import scala.collection.mutable.Set
    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }
  /**
    * hashMap->Map
    * 测试map
    */
  def testMap() = {
    var capital1 = Map("US" -> "Washington", "France" -> "Paris")
    capital1 += ("Japan" -> "Tokyo")
    println(capital1("France"))
    import scala.collection.mutable.Map
    val animal = Map[Int, String]()
    animal += (1 -> "Pig")
    animal += (2 -> "Cat")
    animal += (3 -> "Dog")
    println(animal)
    println(animal(2))
  }

  // 以序列形式返回一行乘法表
  def makeRowSeq(row: Int) =
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }

  // 以字串形式返回一行乘法表
  def makeRow(row: Int) = makeRowSeq(row).mkString

  // 以字串形式返回乘法表,每行记录占一行字串
  def multiTable() = {
    val tableSeq = // 行记录字串的序列
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }

}
