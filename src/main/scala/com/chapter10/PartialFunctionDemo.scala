package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 16:28
  *       偏函数
  */
object PartialFunctionDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 5, "abc")

    //输入参数是Any类型,返回值类型是Int
    //如果isDefinedAt(x: Any)返回true,就会调用apply(v1: Any)方法
    val partial = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    //偏函数不能应用于map,只能使用collect
    val p = list.collect(partial) //会调用5次isDefinedAt(x: Any)
    println(p)

    val list2 = list.collect(p2)
    println(list2)

    //偏函数简写
    val list3 = list.collect { case item: Int => item + 1 }
    println(list3)
  }

  //偏函数简写
  def p2: PartialFunction[Any, Any] = {
    case int: Int => int + 1
    case str: String => str + "haha"
  }
}
