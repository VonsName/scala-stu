package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 19:46
  *      类型推断
  *      如果变量只在=>右边出现一次,可以使用_代替
  *      如果只有一个参数,括号可以去掉
  *      215
  */
object TypeInfer {
  def main(args: Array[String]): Unit = {
    val ints = List(1, 2, 3, 5)

    ints.map((x: Int) => x + 1)
    ints.map((x) => x + 1)
    ints.map(x => x + 1)
    ints.map(_ + 1)

    //元素相加赋值给左边的参数,再继续相加
    println(ints.reduce(_+_))//11
    println(ints.sum)//11
  }
}
