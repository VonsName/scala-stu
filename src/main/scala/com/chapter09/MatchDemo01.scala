package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 17:11
  *       类似JAVA的switch
  *       189
  */
object MatchDemo01 {
  def main(args: Array[String]): Unit = {

    val op = '+'
    val n1 = 20
    val n2 = 30
    var res = 0
    var opTemp = '+'

    //case后如果有变量,会把表达式的值赋值给这个变量
    val r = op match {
      case '+' => res + 10
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      //如果case 有条件守卫 不再表示默认匹配
      case _ if op > 1 => println(">20")
      //表示默认
      case _ => println("error")
    }
    println(r)
    println(res)
  }
}
