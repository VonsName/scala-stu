package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 11:24
  * 类似fold,但是会保存所有中间结果(最后是一个List)
  */
object ScanDemo01 {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3)
    //5 (1 2, 3) //相当于把5放在list左边,
    val i = list.scanLeft(5)(sum)
    println(i)//List(5, 6, 8, 11)

    val i1 = list.scanRight(5)(sum)
    println(i1)//List(11, 10, 8, 5)
  }

  def sum(int1: Int, int2: Int): Int = {
    int1 + int2
  }
}
