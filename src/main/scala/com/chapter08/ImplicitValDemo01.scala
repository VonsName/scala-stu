package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 10:00
  */
object ImplicitValDemo01 {

  def main(args: Array[String]): Unit = {


    //优先级比默认参数高
    implicit val str: String = "wangwu"

    //编译器会默认搜索隐式值作为函数参数的默认值
    def hello(implicit name: String="liu"): Unit = {
      println(name)
    }

    hello
  }
}
