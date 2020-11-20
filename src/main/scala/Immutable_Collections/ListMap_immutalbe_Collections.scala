package Immutable_Collections

import scala.collection.immutable.ListMap

object ListMap_Immutable_Collections extends App{

  println("\n Step 1:How to initialize a ListMap with three elements")
  val listMap1 = ListMap("PD" ->"Plain Donut","SD" -> "StrawBerry Donut","CD" -> "Chocolate Donut","CCD" ->"Coconut Donut")
  println(s"print out the listMap1 is : ${listMap1}")

  println("\n Step 2:How to access the element by specific key in the ListMap")
  println(s"Element by key SD =${listMap1("PD")}")
  println(s"Element by key PD =${listMap1("SD")}")

  println("\n Step 3:How to add the element into the listMap")
  val listMap2 = listMap1 + ("KD" -> "crispy creme Donut")
  println(s"Element from the listMap2 = ${listMap2}")


  println("\n Step 4:How to add the two listMap together")
  val listMap3 = listMap1 ++ listMap2
  println(s"Element from the listMap3 = ${listMap3}")

 println("\n Step 5:How to remove the ListMap from any element")
  val listMap4 = listMap3 -("CD")
  println(s"Element from the listMap4 = ${listMap4}")

println("\n Step 6:How to initialize the ListMap with emptySet")
  val listMapEmpty = ListMap.empty[String,String]
println(s"Element from empty listMap : ${listMapEmpty}")
}
