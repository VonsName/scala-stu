package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 11:09
  *       可以根据类型和值以及值的个数一起判断
  */
object MatchArrayDemo01 {
  def main(args: Array[String]): Unit = {
    val arrs = Array(Array(0), Array(1, 2), Array(1, 2, 3), Array("lisi"), Array(0, 1, 2, 3, 0))
    for (elem <- arrs) {
      val value = elem match {
        case Array(0) => 0
        case Array(x, y) => "1,2"
        case Array(x, y, z) => Array(y, z, x)
        //匹配以值为0开头的数组
        case Array(0, _*) => "匹配以值为0开头的数组"
        case _ => "没得"
      }
      println(value)
    }


    println("==================匹配List")
    val arrs1 = Array(List(0), List(1, 2), List(1, 2, 3), List("lisi"), List(0, 1, 2, 3, 0))
    for (elem <- arrs1) {
      val value = elem match {
        case List(0) => 0
        case List(x, y) => "1,2"
        case List(x, y, z) => List(z, y, x)
        //匹配以值为0开头的数组
        case List(0, _*) => "匹配以值为0开头的数组"
        case _ => "没得"
      }
      println(value)
    }


    println("==================匹配元组Tuple")
    val arrs2 = Array((0,9), (1, 2), (1, 2, 3), ("1","李四"), (0, 1, 2, 3, 0))
    for (elem <- arrs2) {
      val value = elem match {
        case (2,_) => 0
        case (x, y) => "1,2"
        case (x, y, z) => (z, y, x)
        //匹配以值为0开头的数组
        case (0, _) => "匹配以值为0开头的数组"
        case _ => "没得"
      }
      println(value)
    }
  }
}
