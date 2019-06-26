package com.chapter09

/**
  * @author ： fjl
  * @date ： 2019/6/26/026 17:11
  *       类似JAVA的switch
  *       189
  */
object MatchDemo01 {
  def main(args: Array[String]): Unit = {

    val op = '*'
    val n1 = 20
    val n2 = 30
    var res = 0

    op match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      //表示默认
      case _ => println("error")
    }
    println(res)
  }
}
