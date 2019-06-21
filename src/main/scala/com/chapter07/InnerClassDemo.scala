package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 16:42
  */
object InnerClassDemo {
  def main(args: Array[String]): Unit = {
    val outerClass1: OuterClass = new OuterClass
    val outerClass2: OuterClass = new OuterClass
    val innerClass1: outerClass1.InnerClass = new outerClass1.InnerClass
    val innerClass2: outerClass2.InnerClass = new outerClass2.InnerClass
    innerClass1.info(innerClass1)
    innerClass2.info(innerClass2)

    //scala的内部类是和外部类的对象绑定的
    //即innerClass1和对应的outerClass1绑定,所以这里不能传入outerClass2的对象innerClass2
    //    innerClass1.info(innerClass2)
    //但是可以使用OuterClass#InnerClass解决
    innerClass1.info(innerClass2)
  }
}

class OuterClass {


  //outer表示外部类OuterClass的一个对象
  outer =>
  var name: String = _

  class InnerClass {
    def info(): Unit = {
      println(OuterClass.this.name)
      println(outer.name)
    }

//    OuterClass#InnerClass 类型投影
    def info(innerClass: OuterClass#InnerClass): Unit = {
      println(innerClass)
    }
  }

}

