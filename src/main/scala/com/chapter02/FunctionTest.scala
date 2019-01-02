package com.chapter02

/**
  * @author ： fjl
  * @date ： 2018/12/28/028 10:18
  */
object FunctionTest {
  def main(args: Array[String]): Unit = {
    sayHi()
    sayHi
  }

  def sayHi(): Unit = {
    println("hi")
  }
}
