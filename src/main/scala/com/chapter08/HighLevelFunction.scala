package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 16:36
  *       高阶函数
  */
object HighLevelFunction {
  def main(args: Array[String]): Unit = {
    println(test(sum, 2))
  }

  //test是一个高阶函数,它接受一个函数作为参数,
  // f: Double => Double表示一个函数接受一个Double类型作为参数,返回类型也是Double
  def test(f: Double => Double, n1: Double): Double = {
    f(n1)
  }

  //test1高阶函数接受一个无参的函数作为参数
  def test1(f: () => Unit): Unit = {

  }

  def sum(double: Double): Double = {
    double + double
  }
}
