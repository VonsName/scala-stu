package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 16:36
  *       高阶函数
  *       高阶函数也可以返回一个函数类型
  */
object HighLevelFunction {
  def main(args: Array[String]): Unit = {
    println(test(sum, 2))

    //min是就匿名函数 x: Int => x * y
    println("高阶函数返回函数类型")
    val min = minus(4)
    println(min(3))
    //和上面的写法等价
    println(minus(4)(3))
  }


  /**
    * 高阶函数也可以返回一个函数类型
    * Int => 表示里面的匿名函数的参数类型
    *
    * @param y
    * @return
    */
  def minus(y: Int): Int => Int = {
    x: Int => x * y //匿名函数,
  }

  //等价上面的写法,里面的匿名函数引用外部的y变量,形成了一个闭包
  def minus1(y: Int): Int => Int = (x: Int) => x + y

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
