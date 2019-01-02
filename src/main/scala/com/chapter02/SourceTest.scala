package com.chapter02

/**
  * @author ： fjl
  * @date ： 2018/12/28/028 9:11
  */
object SourceTest {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](10)
    for (item <- arr) {
      println(s"item=$item")
    }
  }
}
