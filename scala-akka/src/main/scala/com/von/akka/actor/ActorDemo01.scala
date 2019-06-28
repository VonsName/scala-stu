package com.von.akka.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * @author ： fjl
  * @date ： 2019/6/28/028 14:53
  */
class ActorDemo01() extends Actor {

  //当前Actor的MailBox接受到消息的时候,就会调用该方法
  override def receive: Receive = {
    case 1 => println("HELLO 1")
    case 2 => println("HELLO 2")
    case 3 =>
      println("退出")
      context.stop(self) //停止ActorRef
      context.system.terminate() //停止ActorSystem
    case _ => println("NO ")

      sender() //可以获取发送消息的对象
  }
}

/**
  * Exception in thread "main" java.lang.NoSuchMethodError:
  * scala.actors.AbstractActor.$init$(Lscala/actors/AbstractActor;)V
  * scala版本不匹配Actor的版本
  * 使用scala的2.12+
  */
object ActorDemo01 {

  private val actorFactory: ActorSystem = ActorSystem("Server")
  //Props[ActorDemo01] 使用反射创建Actor
  private val aRef: ActorRef = actorFactory.actorOf(Props[ActorDemo01], "a1")

  def main(args: Array[String]): Unit = {
    aRef ! 1
    aRef ! 3
  }
}
