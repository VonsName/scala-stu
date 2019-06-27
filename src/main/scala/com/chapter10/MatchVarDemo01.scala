package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 14:56
  */
object MatchVarDemo01 {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    println(x, y)
    //(1,2)
    val array = Array(1, 2, 3, 5)
    val Array(first, second, _*) = array
    println(first) //1
    println(second) //2

    println("============")
    val map = Map(("1", 1), ("2", 2), ("3", 3))

    //(k, 2) 表示只取出值为2的元素
    for ((k, 2) <- map) {
      println(k)
    }

    println("-----------")
    //匹配值为3的元素
    for ((k, v) <- map if v == 3) {
      println(k)
    }
  }
}
