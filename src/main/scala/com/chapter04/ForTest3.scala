package com.chapter04

/**
  * @author ： fjl
  * @date ： 2019/1/7/007 19:00
  */
object ForTest3 {
  def main(args: Array[String]): Unit = {

    //yield i 将每次循环的数据存储到Vector集合中,并返回给res
    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    //Vector(1, 2, 3)
    println(res)
  }
}
