package com.chapter08

import scala.collection.mutable

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 14:02
  */
object MapOperateTest01 {
  def main(args: Array[String]): Unit = {
    val str = "AAAAAABBBBCCCCCCCCCCDDDDDDDDDDDDEEEEEEEEEEEE"
    val m = mutable.Map[Char, Int]()
    str.foldLeft(m)(count)
    println(m)
  }

  def count(m: mutable.Map[Char, Int], key: Char): mutable.Map[Char, Int] = {
    m += (key -> (m.getOrElse(key, 0) + 1))
  }
}
