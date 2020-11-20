package Immutable_Collections

import scala.collection.immutable.Queue

object Queue_Immutable_Collections extends App{

  println("How to initialize queue with 3 parameters")
  val queue1 = Queue("Plain Donut","Glazed Donut","Cheese Donut")
  println(s"Element of the queue is :${queue1}")

  println("How to acces the queue using index ")
  println(s"using index value to access the queue 0: ${queue1(0)}")
  println(s"using index value to access the queue 1: ${queue1(1)}")
  println(s"using index value to access the queue 2: ${queue1(2)}")

  println("How to add the element in queue ")
  val queue2 = queue1 :+ "chocolate Donut"
  println(s"After append the element in the queue is : ${queue2}")

  println("How to add the element in queue using enqueue")
  val enqueue = queue2.enqueue("Vanilla Donut")
  println(s"After append the element using enqueue is : ${enqueue}")
}
