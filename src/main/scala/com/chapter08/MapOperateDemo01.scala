package com.chapter08

import java.util.regex.Pattern

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 16:47
  *      174
  */
object MapOperateDemo01 {

  def main(args: Array[String]): Unit = {
    //    test()
    //    test2()
    test3()
  }


  def test3(): Unit = {
    val list = List("alice", "Alias", "Jack")
    //过滤出来首字母包含大写的
    val list1 = list.filter(withUp)
    println(list1)
  }

  def withUp(string: String): Boolean = {
    val pattern = Pattern.compile("[A-Z]")
    pattern.matcher(string.charAt(0) + "").matches()
  }

  def test2(): Unit = {
    val list = List("alice", "jack")
    val upList = list.map(toUp)
    println(upList)
    //List(ALICE, JACK)
    val chars = list.flatMap(toUp)
    println(chars) //List(A, L, I, C, E, J, A, C, K)
  }

  def toUp(string: String): String = {
    string.toUpperCase
  }

  def test(): Unit = {
    val list = List(1, 2, 3)
    val ints = list.map(test1)
    println(ints) //List(2, 4, 6)
  }

  def test1(int: Int): Int = {
    int + int
  }
}
