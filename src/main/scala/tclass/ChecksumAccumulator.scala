package tclass

/**
  * Description: 测试类
  * Version:v1.0
  * Created by leal 
  * on 4/14/17:1:33 PM.
  */
class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte) {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xFF) + 1
}
