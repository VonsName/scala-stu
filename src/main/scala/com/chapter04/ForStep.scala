package com.chapter04

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 19:17
  */
object ForStep {
  def main(args: Array[String]): Unit = {
    //Range 设置循环的步长
    for (i <- Range(1, 10, 2)) {
      println(i)
    }
  }
}
