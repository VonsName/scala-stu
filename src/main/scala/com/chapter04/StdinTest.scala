package com.chapter04

import scala.io.StdIn

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 16:15
  */
object StdinTest {
  def main(args: Array[String]): Unit = {
    println("请输入名字：")
    val name = StdIn.readLine()
    println(name)
    val start: Int = 1
    val end: Int = 10
    for (i <- start to end) {
      println(i)
    }
  }
}
