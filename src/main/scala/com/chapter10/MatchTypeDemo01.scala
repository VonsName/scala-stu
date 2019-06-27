package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 10:29
  *      类型匹配 根据对象的类型匹配
  */
object MatchTypeDemo01 {
  def main(args: Array[String]): Unit = {
    val a = 7
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 7) Array(1, 2, 3)
    val result = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是String为键,Int为值的map"
      case c: Array[Int] => "Int数组"
      case _ => "啥也不是"
    }

    println(result)
  }
}
