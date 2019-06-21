package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 14:44
  *       在scala中 JAVA中的接口可以当作trait使用
  */
object TraitDemo {
  def main(args: Array[String]): Unit = {
    val userInterface = new UserInterfaceImpl
    userInterface.addUser()

    //动态混入,可以在不修改声明或定义的情况下增加功能
    val book = new BuyBook with BookTrait
    book.book()

    val buyBook1 = new BuyBook1 with BookTrait {
      override def buy(): Unit = {
        println("BuyBook1")
      }
    }
    buyBook1.buy()
    buyBook1.book()
  }
}


trait BookTrait {
  def book(): Unit = {
    println("默认实现的方法")
  }
}

/**
  * trait类似于Java中的接口
  * 区别是:trait中可以有抽象的方法,也可以有具体实现的方法
  */
trait UserInterface {
  def addUser()
}

trait UserAddLogInterface {
  def addUserLog()
}

class BuyBook {

}

abstract class BuyBook1 {
  def buy()
}

class UserInterfaceImpl extends BuyBook with UserInterface with UserAddLogInterface {
  override def addUser(): Unit = {
    println("add User ~~~")
  }

  override def addUserLog(): Unit = {
    println("add User Log~~~")
  }
}