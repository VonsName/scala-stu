package com.chapter05

import scala.beans.BeanProperty

/**
  * @author ： fjl
  * @date ： 2019/6/18/018 11:34
  */
object ObjTest {

  def main(args: Array[String]): Unit = {
    val dog = new Book("小汪汪")
    val dog1 = new Book("小汪汪")
    //    dog.name = "小汪汪"
    //    dog.age = 2
    //    dog.show()
    println(dog)
    println(dog1)
    val book3 = new Book3
    book3.getName
    book3.setName("lala")
  }
}

//主构造器
class Book private(_name: String, _age: Int) {
  var name: String = _name
  var age: Int = _age

  //辅助构造器
  def this(name: String) {
    //第一行必须显示调用主构造器
    this(name, 23)
  }

  def show(): Unit = {
    println(name, age)
  }

  override def toString: String = {
    "name=" + this.name + ",age=" + this.age
  }
}


//构造器的属性前面+修饰符val,底层会把该属性当作类的一个私有只读属性
//如果不加修饰符,就是一个局部变量
//private String final name;
class Book1(val name: String) {

}

//构造器的属性前面+修饰符var,底层会把该属性当作类的一个私有可读写属性
//如果不加修饰符,就是一个局部变量
//private String  name;
class Book2(var name: String) {

  var no: Int = _
}


class Book3() {
  //自动生成getter以及setter方法
  @BeanProperty var no: Int = _
  @BeanProperty var name: String = _
}