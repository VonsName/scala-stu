package com.chapter08

import scala.collection.mutable.ListBuffer

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 15:04
  */
object TupleDemo01 {
  def main(args: Array[String]): Unit = {
    //    test()
    //    test1()
    //    test2()
    test3()
  }

  //ListBuffer是可变的
  def test3(): Unit = {
    val lb = ListBuffer[Int](1, 2, 3)
    println(lb) //1, 2, 3

    println("===========")
    lb += 4
    lb.append(5)
    println(lb) //1, 2, 3, 4, 5


    println("===========")
    val lb1 = ListBuffer[Int](9, 19)
    lb1 ++= lb
    println(lb1) //9, 19, 1, 2, 3, 4, 5
    lb1.remove(0)
    println(lb1) //19, 1, 2, 3, 4, 5
  }

  def test2(): Unit = {
    val list = List(1, 2, 3)
    //把所有元素存入到Nil空的List里面去
    val list1 = 4 :: 5 :: 6 :: list :: Nil
    println(list1) //List(4, 5, 6, List(1, 2, 3))

    val list2 = 4 :: 5 :: 6 :: list ::: Nil
    println(list2) //List(4, 5, 6, 1, 2, 3)
  }

  //scala的List是不可变的
  //val List = scala.collection.immutable.List
  //ListBuffer是可变的
  def test1(): Unit = {
    val list = List(1, 2, 3)
    println(list)
    println(list(1))

    println("-----")

    //追加一个元素之后返回的是一个追加元素后新的List,原来的List并没有被改变
    //:+ +号在后面表示把元素追加到List的末尾
    val ints = list :+ 5
    println("list", list) //1, 2, 3
    println("ints", ints) //1, 2, 3,5

    println("-----")
    //+:  +号在前面表示追加元素到原来的List的前面
    val list1 = 10 +: list
    println("list", list) //1, 2, 3
    println("ints", ints) //1, 2, 3, 5
    println("list1", list1) //10, 1, 2, 3

    val nils = Nil
    //List()
    println(nils)
  }

  def test(): Unit = {
    //根据元组的元素的个数生成不同的数据类型
    //Tuple1-Tuple22
    val tuple01 = (1, 2, 3, "4", "5", 0)
    println(tuple01)
    println(tuple01._1) //第一个元素
    println(tuple01.productElement(0)) //第一个元素

    for (elem <- tuple01.productIterator) {
      println(elem)
    }
  }
}
