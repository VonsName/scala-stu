package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 11:03
  *       函数柯理化,将多个参数的一个函数拆分成一个参数的多个函数
  */
object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    //相当于把5加入了list左边 List(5,1, 2, 3, 4, 5)
    //但是函数调用次数不会增加,只会调用5次
    //TODO foldLeft 缩写形式 /:
    val i = list.foldLeft(5)(minus) //(((((5-1)-2)-3)-4)-5)
    val i2 = (5 /: list) (minus) //等价于上面的写法
    println("i:" + i) //-10
    println("i2:" + i2)
    //相当于把5加入了list右边 List(1, 2, 3, 4, 5,5)
    //TODO foldRight 缩写形式 :\
    val i1 = list.foldRight(5)(minus) //(1-(2-(3-(4-(5-5)))))
    val i3 = (list :\ 5) (minus) //等价于上面的写法
    println("i1:" + i1) //-2
    println("i3:" + i3) //-2
  }

  def minus(in1: Int, in2: Int): Int = {
    println("~~")
    in1 - in2
  }
}
