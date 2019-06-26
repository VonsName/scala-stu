package com.chapter09

import scala.collection.mutable.ArrayBuffer

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 13:49
  */
object FoldTestDemo01 {
  def main(args: Array[String]): Unit = {
    val str = "AAAAAAABBBBBBBBBCCCCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEEEE"

    val ab = ArrayBuffer[Char]()
    str.foldLeft(ab)(fd)

    println(ab)
  }

  def fd(ab: ArrayBuffer[Char], str2: Char): ArrayBuffer[Char] = {
    ab.append(str2)
    ab
  }
}
