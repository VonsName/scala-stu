package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 17:09
  *      137
  */
object ImplicitDemo {
  def main(args: Array[String]): Unit = {

    //隐式函数 将Double转换成Int
    implicit def conversion(d: Double): Int = {
      d.toInt
    }

    val num: Int = 3.5
    println(num)
  }
}
