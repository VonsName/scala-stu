package com.chapter05

/**
  * @author ： fjl
  * @date ： 2019/1/17/017 19:02
  *       54
  */
object MethodAndFunction {
  def main(args: Array[String]): Unit = {
//    val dog = new Dog
//    println(dog.sum(10, 3))
//
//    //方法转函数
//    val f1 = dog.sum _
//    println(f1)
//    println(f1(50, 80))
//
//    //函数
//    val f2 = (n1: Int, n2: Int) => n1 + n2
//    println(f2(10, 3))
//
//    val f3 = (name: String) => println(name)
//    println("f3:" + f3)

    funParameter(3,"mary",sex="MAN")
  }

  def test(): Int = {
    return 1 + 1
  }

  def test1() = {
    1 + 1
  }

  def test2() {
  }

  def test3(i: Int): Any = {
    if (i > 3) {
      "s" + i
    } else {
      1
    }
  }

  def funParameter(age: Int = 2, name: String="王五", sex: String): Unit = {
    println(age,name,sex)
  }
}

class Dog {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}


