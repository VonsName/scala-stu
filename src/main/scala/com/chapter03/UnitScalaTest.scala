package com.chapter03

/**
  * @author ： fjl
  * @date ： 2019/1/2/002 15:50
  */
object UnitScalaTest {
  def main(args: Array[String]): Unit = {
    println(sayHello())
    println(sayInt())

    //null 只能赋值给引用类型
    var dog: Dog = null
    println(dog)

    val a = 10 max 2
    println(a)
    val s = "crazy" * 3
    println(s)

    val bi: BigInt = 2
    val q = bi.pow(1024)
    println(q)
    val str: String = "Hello"
    println(str.head)
    println(str.tail)
    println(str.takeRight(1))
    println(str.reverse.take(1))
  }

  def sayHello(): Unit = {

  }

  def sayInt(): Int = {
    1
  }
}

class Dog {

}
