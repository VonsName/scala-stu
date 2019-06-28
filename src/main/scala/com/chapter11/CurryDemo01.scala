package com.chapter11

/**
  * @author ： fjl
  * @date ： 2019/6/28/028 10:10
  *       函数柯理化 多个参数的1个函数拆分成一个参数的多个函数
  */
object CurryDemo01 {
  def main(args: Array[String]): Unit = {

    println(multiply(3)(2))

    val str: String = "hello"
    val functionToBoolean = str.strEq("HELLO")(eq)
    println(functionToBoolean)

    //简写
    println(str.strEq("HELLO")(_.equals(_)))

    var sum: Int = 0
    println(rec(sum, 100))
  }


  //函数柯理化
  def multiply(int1: Int)(int2: Int): Int = int1 * int2

  def eq(str1: String, str2: String): Boolean = {
    str1.equals(str2)
  }

  implicit class Eq(str: String) {
    def strEq(s: String)(f: (String, String) => Boolean): Boolean = {
      f(str.toLowerCase, s.toLowerCase())
    }
  }

  def rec(sum: Int, int: Int): Int = {
    if (int == 0) {
      return sum
    }
    rec(sum + int, int - 1)
  }
}
