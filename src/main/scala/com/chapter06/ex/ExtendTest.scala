package com.chapter06.ex

/**
  * @author ： fjl
  * @date ： 2019/6/18/018 15:51
  */
object ExtendTest {
  def main(args: Array[String]): Unit = {
    println(classOf[P1])
  }

  val p2: P1 = new P2
  println(p2.isInstanceOf[P2])
  //强制类型转换
  p2.asInstanceOf[P2]

  //匿名类
  var animal: Animal =new Animal {
    override var name: String = _

    override def cray(): Unit = {

    }
  }
}

class P1 {

}

class P2 extends P1 {

}

//
abstract class Animal {
  //没有赋值表示抽象字段
  var name: String

  //抽象方法
  def cray()
}