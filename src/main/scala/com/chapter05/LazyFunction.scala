package com.chapter05

/**
  * @author ： fjl
  * @date ： 2019/6/17/017 11:04
  *       惰性函数->惰性计算
  */
object LazyFunction {

  def main(args: Array[String]): Unit = {

    //变量声明为lazy,只有当返回值res真正被使用的时候,
    // 函数sum()才会被真正调用
    //lazy不能修饰var
    lazy val res = sum(2, 3)
    println("res==="+res)
  }

  def sum(i: Int, j: Int) = {

    println("sum()...")
    i + j
  }


}
