package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 15:32
  *
  */
object MidCaseDemo01 {
  def main(args: Array[String]): Unit = {
    List(1, 3, 5, 7) match {
      case f :: s :: l => println(f, s, l) //(1,3,List(5, 7))
      case _ => println("nothing")
    }
  }
}
