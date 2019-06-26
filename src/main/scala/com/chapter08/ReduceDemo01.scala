package com.chapter08

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 10:24
  */
object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    //从集合最左边的数开始((((1+2)+3)+4)+5),每次返回的值赋值给函数左边的参数
    val sums = list.reduceLeft(sum)
    println(sums)

    //从集合最右边的数开始(1+(2+(3+(4+5)))),每次返回的值赋值给函数右边的参数
    val sum2 = list.reduceRight(sum)
    println(sum2)

    //利用reduce求最大值最小值
    val mins = list.reduceRight(min)
    println(mins)
  }

  def sum(int1: Int, int2: Int): Int = {
    int1 + int2
  }

  def min(int1: Int, int2: Int): Int = {
    if (int1 < int2) {
      int1
    } else {
      int2
    }
  }
}
