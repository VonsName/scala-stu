package com.chapter10

/**
  * @author ： fjl
  * @date ： 2019/6/27/027 14:23
  */
object MatchObject {
  def main(args: Array[String]): Unit = {
    val num: Double = 36.0
    num match {
      //把num当作参数,调用unapply(arg: Double),
      // 然后把unapply(arg: Double)返回的结果赋值给n
      case Square(n) => println(n)
      case _ => println("noting")
    }
  }

  val string: String = "a,b,c"
  string match {
      //会调用unapplySeq(str: String)
    case UnSeq(str1, str2, str3) => println(s"$str1 $str2 $str3")
    case _ => println("nothing")
  }
}

class Square {

}


object UnSeq {
  def unapplySeq(str: String): Option[Seq[String]] = if (str.contains(",")) {
    Some(str.split(","))
  } else None
}

object Square {

  //对象提取器
  def unapply(arg: Double): Option[Double] = Some(math.sqrt(arg))

  def apply(z: Double): Double = z * z

}
