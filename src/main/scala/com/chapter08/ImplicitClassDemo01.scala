package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 10:36
  */
object ImplicitClassDemo01 {
  def main(args: Array[String]): Unit = {
    implicit class DB1(val mysql1: Mysql1) {
      def addPrefix(): String = {
        mysql1 + "scala"
      }
    }

    val mysql = new Mysql1
    mysql.sayHi()
    mysql.addPrefix()
    mysql.sayHi()
  }
}

class Mysql1 {
  def sayHi(): Unit = {
    println("mysql1")
  }
}
