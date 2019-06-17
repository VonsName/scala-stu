package com.chapter05

/**
  * @author ： fjl
  * @date ： 2019/6/17/017 13:44
  */
object ObiTest {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    //    cat.age = 23
    //    cat.name = "李四"
    println(cat.name)
    println(cat.age)
    val list = List(1, 2, 3)
    println(list.reverse)
    for (i <- 1 to list.size) {
      println(i)
    }
    println(list.take(0))
    for (i <- 1 to list.size reverse) {
      println(i)
    }
  }
}

//默认是public修饰的
class Cat {
  //底层的形式是:private String name=""
  //默认赋值为null
  //如果手动赋值null,则必须显示的声明类型,不能使用类型推导
  var name: String = _
  //底层的形式是:private int age=0
  //_ 表示默认赋值为0
  var age: Int = _

}
