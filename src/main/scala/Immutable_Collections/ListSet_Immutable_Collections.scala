package Immutable_Collections

import scala.collection.immutable.ListSet

object ListSet_Immutable_Collections extends App {

  println("Step 1:How to initialize the listset of immutable ")
  val listSet1 = ListSet("Plain Donut","StrawBerry Donut","Coconut Donut")
  println(s"Elements of listSet1: ${listSet1}")

  println("Step 2:How to check the element in the ListSet")
  println(s"Element is present in the listSet is ${listSet1("Plain Donut")}")
  println(s"Element is present in the listSet is ${listSet1("StrawBerry Donut")}")
  println(s"Element is present in the listSet is ${listSet1("Coconut Donut")}")

  println("Step 3: How to add the element is listSet")
  val listSet2 = listSet1 + "Vanilla Donut"
  println(s"Element of listset2 is : ${listSet2}")


  println("Step 4: How to add two List of listset together")
  val listSet3 = listSet1 ++ listSet2
  println(s"Element of two listSet added together is:${listSet3}")

  println("Step 5:How to remove the ListSet of element ")
  val listSet4 = listSet3 -"Plain Donut"
  println(s"Element removed from the listSet is : ${listSet4}")

  println("Step 6: How to create a empty ListSet")
  val listSet5 = ListSet.empty[String]


}
