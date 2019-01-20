package com.chapter04

import util.control.Breaks._

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 19:40
  *      51
  */
object BreakTest {
  def main(args: Array[String]): Unit = {
    var n = 0
    //breakable()是一个高阶函数,能够接受一个函数的函数,可以把()换成{}
    //它对break()抛出的异常进行了处理
    breakable{
      while (n <= 20) {
        n += 1
        println(n)
        if (n == 18) {
          //使用break函数退出循环,实际上是抛出了一个异常
          break()
        }
      }
    }
    println("ok~~")
  }
}
