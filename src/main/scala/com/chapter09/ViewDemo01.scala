package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 16:34
  *      类似懒加载
  */
object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    val seqViewF = (1 to 100).view.filter(same)
    println(seqViewF)
  }

  def same(int: Int): Boolean = {
    int.toString.equals(int.toString.reverse)
  }
}
