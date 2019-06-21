package com.chapter06

/**
  * @author ： fjl
  * @date ： 2019/6/18/018 17:01
  */

object AccompanyObjDemo {
  def main(args: Array[String]): Unit = {
    val list = List("1", "2")
  }
}



//伴生类,写非静态的类容
class AccompanyObj {

}


//伴生对象,专门用来写静态的内容,可以直接通过类名访问,相当于JAVA的静态
//编译后底层生成AccompanyObj$类,文件名为AccompanyObj$.class
object AccompanyObj {

}

