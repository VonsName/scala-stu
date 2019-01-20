package com.chapter04

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 18:50
  */
object ForTest {
  def main(args: Array[String]): Unit = {
    val list = List("1", "2", "3")
    for (item <- list) {
      println(item)
    }
    //until 前闭后开 包括前面的,不包括后面的
    for (i<-1 until 3){
      println(i)
    }
  }
}
