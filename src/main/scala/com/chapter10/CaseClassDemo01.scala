package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 15:11
  */
object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {

    val currency = Currency(22, "RMB")
    //如果不传参数 currency==currencyCopy
    val currencyCopy = currency.copy()
    println(currencyCopy == currency)

    //如果传了参数,就是创建了一个新的对象
    val currencyCopy1 = currency.copy(money = 55)
    println(currencyCopy1 == currency)

    println(currency)
    println(currencyCopy)

  }
}

//sealed 表示密封类,该类的所有子类只能声明在当前文件中
sealed abstract class Amount

//样例类,会生成2个文件 Dollar.class Dollar$.class
case class Dollar(money: Double) extends Amount

case class Currency(money: Double, unit: String) extends Amount

case object NonAmount extends Amount
