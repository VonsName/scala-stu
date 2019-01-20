package com.chapter04

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 18:53
  */
object ForTest2 {
  def main(args: Array[String]): Unit = {

    //循环守卫，相当于Java中的continue，如果条件成立,进入循环体,
    //不成立直接进入下一次循环
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    println("second....")
    for (i <- 1 to 3; j = i + 1) {
      println(j)
    }
  }
}
