package example

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Description: 测试提交打包
  * 启动master: start-master.sh
  * 启动worker: spark-class org.apache.spark.deploy.worker.Worker spark://lea-ldb:7077
  * 提交作业： spark-commit --master spark://lea-ldb:7077 --class example.WordCount /home/leal。。
  * Version:v1.0
  * Created by leal 
  * on 4/13/17:3:40 PM.
  */
object WordCount {

  def main(args: Array[String]): Unit = {
//    if (args.length == 0) {
//      System.err.println("Usage: WordCount <file1>")
//      System.exit(1)
//    }
    //每个JVM只能声明一个，用完要stop
    val conf = new SparkConf().setAppName("wordcount")
    val sc = new SparkContext(conf)
    val input = sc.textFile("/home/leal/Templates/Spark/res/helloSpark.txt")
    //    input.flatMap(_.split(" ")).map(x => (x, 1))
    // .reduceByKey(_ + _).map(x=>(x._2,x._1)).sortByKey(false).
    // map(x=>(x._2,x._1)).take(10).foreach(println)
    val lines = input.flatMap(line => line.split(" "))
    val count = lines.map(word => (word, 1)).reduceByKey { case (x, y) => x + y }
    val output = count.saveAsTextFile("home/leal/Templates/Spark/res")
    sc.stop()
  }

}
