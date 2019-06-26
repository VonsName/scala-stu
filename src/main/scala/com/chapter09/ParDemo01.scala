package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 16:46
  */
object ParDemo01 {
  def main(args: Array[String]): Unit = {
    (1 to 5).foreach(print(_))

    println("----------")
    (1 to 5).par.foreach(print(_)) //并行

    println()
    val res1 = (1 to 100).map(_ => Thread.currentThread().getName).distinct
    val res2 = (1 to 100).par.map(_ => Thread.currentThread().getName).distinct
    println(res1)
    println(res2)
  }
}
