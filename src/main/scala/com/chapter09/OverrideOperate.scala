package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 16:54
  *       操作符重载
  */
object OverrideOperate {

  def main(args: Array[String]): Unit = {
    val money1 = new Money
    money1.amount = 23

    val money2 = new Money
    money2.amount = 25

    val money = money1.+(money2)
    println(money)

    val unit = money1 + money2
    println(unit)
    unit ++ ()
    println(unit)

    println(!unit)
  }
}

class Money {
  var amount: Int = _

  def +(money: Money): Money = {
    this.amount = this.amount + money.amount
    this
  }

  //后置++
  def ++(): Money = {
    this.amount += 1
    this
  }


  //重载一元运算符必须要 unary_
  def unary_!(): Money = {
    this.amount = -this.amount
    this
  }

  override def toString = s"Money($amount)"
}

object Money {
  def apply: Money = new Money()
}
