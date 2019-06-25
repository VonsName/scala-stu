package com.chapter08

import scala.collection.mutable

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 16:06
  */
object MapDemo01 {

  def main(args: Array[String]): Unit = {
    //    test1()
    test2()
  }

  //可变Map,无序
  def test2(): Unit = {
    val map = mutable.Map[Int, String](1 -> "alice", 2 -> "tom", 3 -> "array")
    for (elem <- map) {
      println(elem)
    }

    println()
    //对偶元组
    val map1 = mutable.Map((2, "alice"), (1, "tom"), (3, "array"))
    for (elem <- map1) {
      println(elem)
    }

    println()
    println(map1(3))
    println(map1.contains(13))
    println(map1.get(13))
    println("adddd=============")
    map1(5)="Alibaba" //有就修改,没有就新增
    for (elem <- map1) {
      println(elem)
    }
  }

  //不可变Map,有序
  def test1(): Unit = {
    val map1 = Map(1 -> "alice", 2 -> "tom", 3 -> "array")
    for (elem <- map1) {
      println(elem)
    }
    println("==========")
    for (elem <- map1) {
      println("s:" + elem._1, elem._2)
    }
  }
}
