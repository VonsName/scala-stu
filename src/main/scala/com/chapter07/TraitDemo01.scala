package com.chapter07

/**
  * @author ： fjl
  * @date ： 2019/6/21/021 15:15
  */
object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    //多个trait叠加,动态混入对象
    val traitTest = new MixInTraitTest with MixInTrait2 with MixInTrait3
    traitTest.mix()
  }
}


trait MixInTrait {
  println("MixInTrait")

  def mix()
}

trait MixInTrait1 extends MixInTrait {
  println("MixInTrait1")

  override def mix(): Unit = {
    println("MixInTrait1 实现")
  }
}

trait MixInTrait2 extends MixInTrait1 {
  println("MixInTrait2 impl")

  override def mix(): Unit = {

    println("MixInTrait2实现")
    super.mix()
  }
}


trait MixInTrait3 extends MixInTrait1 {
  println("MixInTrait3 impl")

  override def mix(): Unit = {

    println("MixInTrait3实现")
    super.mix() //super[MixInTrait1].mix() 调用指定特质的方法
  }
}

class MixInTraitTest {

}
