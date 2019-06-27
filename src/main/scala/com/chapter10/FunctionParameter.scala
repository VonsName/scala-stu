package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 17:08
  *      212
  */
object FunctionParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = {
      3 + x
    }

    val ints = List(1, 2, 3, 5).map(plus)
    println(ints)
    println(plus _)//<function1>

    //(x: Double) => 3 * x 就是匿名函数
    val niming = (x: Double) => 3 * x
    val doubles = List(2,3,5).map(niming(_))
    println(niming)//<function1>
    println(doubles)
  }
}
