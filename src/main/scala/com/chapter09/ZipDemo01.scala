package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 14:44
  *       拉链
  */
object ZipDemo01 {

  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List(5, 6, 7)
    val tuples = list1.zip(list2)
    println(tuples) //List((1,5), (2,6), (3,7))
  }
}
