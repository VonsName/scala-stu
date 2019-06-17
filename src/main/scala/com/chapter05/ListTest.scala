package com.chapter05

/**
  * @author ： fjl
  * @date ： 2019/6/17/017 14:21
  */
object ListTest {
  def main(args: Array[String]): Unit = {
    listPrint(5)
    var res = 1L
    "Hello".foreach(res *= _.toLong)
    println(res)
    //取出第一个字符
    println("Hello".take(1))
    //取出除掉第一个的其他字符
    println("Hello".drop(1))
  }

  def listPrint(n: Int): Unit = {
    //将方法转为函数,可以作为参数
    val p = myPrint _
    (0 to n).reverse.foreach(myPrint)
  }

  def myPrint(i: Int): Unit = {
    println(i)
  }
}
