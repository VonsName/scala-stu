package com.chapter08

import scala.collection.mutable.ArrayBuffer

/**
  * @author ： fjl
  * @date ： 2019/6/25/025 11:23
  *       Array是不可变的
  *       ArrayBuffer-可变
  */
object ListDemo01 {
  def main(args: Array[String]): Unit = {
    //    test2()

    //    test3()
    test4()
  }


  def test4(): Unit = {
    val ab = ArrayBuffer[String]("1", "2", "3")

    //将scala的ArrayBuffer转为Java的List,使用了bufferAsJavaList的隐式函数类型转换
    //将ArrayBuffer转为了Java的List
    import scala.collection.JavaConversions.bufferAsJavaList
    //参数只能是String类型的数组
    val javaArr = new ProcessBuilder(ab)
    val list = javaArr.command()
    println(list)

    println("-----")
    //Java的List转为scala的Buffer
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr: mutable.Buffer[String] = list
    println(scalaArr)
  }

  def test3(): Unit = {

    //二维数组中2个一维数组,每个一维数组中有三个元素
    //2行3列
    val arr = Array.ofDim[Int](2, 3)

    for (elem <- arr) {
      for (item <- elem) {
        print(item)
      }
      println()
    }
  }

  def test2(): Unit = {
    val arr01 = ArrayBuffer[Int](5, 6, 7)
    arr01.append(2, 10, 4, 8)
    for (item <- arr01) {
      println(item)
    }
    arr01.remove(0)

    //Buffer转Array
    val array = arr01.toArray
    //Array转Buffer
    val buffer = array.toBuffer
  }

  def test(): Unit = {
    var arr01 = new Array[Int](4)
    for (i <- arr01) {
      println(i)
    }
    arr01(3) = 10
    println("--------------")
    for (k <- arr01) {
      println(k)
    }

    println("-----")
    val arr02 = Array(1, 2, 3)
    for (index <- arr02.indices) {
      println(arr02(index))
    }
  }
}
