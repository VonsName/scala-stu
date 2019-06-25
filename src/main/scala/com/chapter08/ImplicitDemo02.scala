package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 9:49
  */
object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {

    //使用隐式类型转换给原来的类增加功能
    implicit def addQuery(mysql: Mysql): Oracle = {
      return new Oracle
    }

    val mysql = new Mysql
    mysql.insert()
    mysql.query()
  }
}

class Mysql {
  def insert(): Unit = {
    println("insert")
  }
}

class Oracle {
  def query(): Unit = {
    println("query")
  }
}
