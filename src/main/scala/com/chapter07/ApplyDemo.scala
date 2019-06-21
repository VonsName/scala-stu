package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 14:06
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val pid = Pid()
    println(pid.name)

    val pid0 = Pid("小花猪")
    println(pid0.name)
  }
}

class Pid(_name: String) {
  var name: String = _name
}

object Pid {
  def apply(_name: String): Pid = new Pid(_name)

  def apply(): Pid = new Pid("匿名猪")


  override def toString = s"Pid(apply=${apply.name})"
}
