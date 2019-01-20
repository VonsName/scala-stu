package com.chapter02

/**
  * @author ： fjl
  * @date ： 2018/12/28/028 9:00
  */
object PrintTest {

  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = "word"
    val salary: Double = 18.88
    val fen: Float = 99.09f
    printf("你哈：%s,薪水：%.2f,分：%.3f\n", str1, salary, fen)

    println(s"你好：$str1,$str2")

    //大括号中是一个表达式
    println(s"薪水=${salary * 100}")

    //类型推导
    var num = 10
    println(num)
    //    num = 2.8 compile error 类型只能为Int了
    num = 20
    val age = 5
    println(age)
    //    age = 20 compile error 被val修饰的变量不可在改变
    val dog = new Dog()
    //    dog=new Dog()
    dog.age = 1
    dog.name = "huahua"
  }

  class Dog {
    //_ 默认值
    var age: Int = _
    var name: String = _
  }

}
