package com.chapter08

import scala.collection.mutable

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 15:49
  *       队列是有序列表
  */
object QueueDemo01 {

  def main(args: Array[String]): Unit = {

    test()
  }

  def test(): Unit = {
    val qu = new mutable.Queue[Int]
    qu += 5
    qu.enqueue(1)
    qu.enqueue(2)
    qu.enqueue(3)

    println(qu)
    println("size:", qu.size)
    println(qu.dequeue())//从队头取
    println("size:", qu.size)

    println(qu.last)
    println(qu.head)
    println(qu.tail)//除了第一个以外的所有元素
  }
}
