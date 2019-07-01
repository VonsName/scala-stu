package com.von.akka.actor

import akka.actor.{Actor, ActorSelection}

/**
  * @author ： fjl
  * @date ： 2019/6/28/028 16:15
  *       247
  */
class ActorDemo02(serverHost: String, serverPort: Int) extends Actor {

  private var actorRef: ActorSelection = _

  override def preStart(): Unit = {
    //Server是服务端创建ActorSystem的时候指定的名字
    //a1 是对应服务端Actor的名字
    actorRef = context.actorSelection(s"akka.tcp://Server@$serverHost:$serverPort/user/a1")
    //定时器
//    context.system.scheduler.schedule(Duration.Zero, Duration.create(3000,TimeUnit.MICROSECONDS), self, HeartBeat)
  }

  override def receive: Receive = {
    case _ => println("no")
  }
}

case object HeartBeat
