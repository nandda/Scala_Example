package Immutable_Collections

import scala.collection.immutable.HashMap

object HashMap_Immutable_Collections extends App {

  println("\n Step 1: How to initialize the hash Map with 3 elements")
  val hashMap1 = HashMap(("PD","Plain Donut"), ("SD","StrawBerry Donut"),("CD","Coconut Donut"))
  println(s"Element from the hashMap1 is ${hashMap1}")

}
