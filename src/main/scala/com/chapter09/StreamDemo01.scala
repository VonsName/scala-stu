package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 14:53
  */
object StreamDemo01 {
  def main(args: Array[String]): Unit = {

    def nf(int: Int): Stream[Int] = int #:: nf(int + 1)

    val stream=nf(1)
    println(stream)//Stream(1, ?)
    println(stream.head)//1
    println(stream.tail)//Stream(2, ?)
    println(stream)//Stream(1, 2, ?)
  }
}
