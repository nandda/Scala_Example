package Immutable_Collections

object List_Immutable_Collections extends App{

  println("Step 1:How to initialize an immutable List with 3 elements")
  val list1 = List("Plain Donut","Strawberry Donut","chocolate Donut")
  println(s"Element of the List1 = $list1")

  println("Step 2:How to access the element of the list using specific index")
  println(s"element from the list1 index of 0 is ${list1(0)}")
  println(s"element from the list1 index of 1 is ${list1(1)}")
  println(s"element from the list1 index of 2 is ${list1(2)}")

  println("Step 3:How to append the element of the immutable list using :+")
  val list2 = "vanilla Donut" +: list1 //prepend
  //val list2 = list1 :+ "vanilla Donut" //append
  println(s"element of the list2 is ${list2}")

  println("Step 4:How to add two immutable List together")
  val list3 = list1 ::list2
  println(s"element of two list added together is ${list3}")

  println("Step 5: how to add two immutable list together using :::")
  val list4 = list1:::list2
 println(s"element of two list added together is ${list4}")

  println("Step 6:How to initialize the empty list")
  val list5 = List.empty[String]
  println(s"Empty List =${list5}")
}
