package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 16:24
  */
object TraitDemo02 {


}


trait LogException extends Exception {

  def log(): Unit = {
    println(getMessage)
  }
}


//等价于上面一种写法
trait LogException1 {
  this: Exception =>
  def log(): Unit = {
    println(getMessage)
  }
}
