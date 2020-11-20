package Scala_Example.Tutorial_1

object Range extends App{

  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1to5 = 1 to 5
println(s"Range from 1 to 5 inclusive = ${from1to5}")

println("Step 2: Create a numeric ranges but excluding last digit 5 ")
  val from1until5 = 1 until 5
println(s"Range from 1 until 5 = ${from1until5}")


  println("Step 3:Create a numeric range from 0 to 10 increment by 2")
  val from0to10By2 = 0 to 10 by 2
  println(s"Range from 0 to 10 = ${from0to10By2}")

  println("Step 4: create a alphabetical range from a to z")
  val fromAtoZ = 'a' to 'z'
  println(s"Range between alphabetical = ${fromAtoZ}")

  println("Step 5: Create a alphabetical ranges from a to z by 2 increments")
  val fromAtoZby2 ='a' to 'z' by 2
  println(s"Range between alphabetical by 2 = ${fromAtoZby2}")

  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1to5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1to5.mkString(" ")}")

  val arrayFrom1to5 = (1 to 5).toArray
  println(s"Range to array = ${arrayFrom1to5.mkString(" ")}")

  arrayFrom1to5.foreach(x=> println(x))
  setFrom1to5.foreach(x=>println(x))
  listFrom1To5.foreach(x=>println(x))






}
