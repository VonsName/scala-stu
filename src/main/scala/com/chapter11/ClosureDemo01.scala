package com.chapter11

/**
  * @author ： fjl
  * @date ： 2019/6/28/028 9:57
  */
object ClosureDemo01 {

  def main(args: Array[String]): Unit = {
    val str = makeSuffix(".gif")("book")
    println(str)
  }

  //和下面的写法等价 形成了一个闭包
  def makeSuffix1(suf: String): String => String = (img: String) => {
    if (img.endsWith(suf)) {
      img
    } else {
      img + suf
    }
  }

  //闭包
  def makeSuffix(suf: String): String => String = {
    img: String => {
      if (img.endsWith(suf)) {
        img
      } else {
        img + suf
      }
    }
  }
}
