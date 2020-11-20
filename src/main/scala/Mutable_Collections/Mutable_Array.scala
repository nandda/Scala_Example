package Mutable_Collections

object Mutable_Array extends App{

  println("How to initialize Array with 3 elements")
  val array1 = Array("Plain Donut","Chocolate Donut","StrawBerry Donut")
  println(s"Element of array1 is : ${array1.mkString(",")}")

  println("How to access elements at specific index in an Array")
  println(s"Element at index 0 = ${array1(0)}")
  println(s"Element at index 0 = ${array1(1)}")
  println(s"Element at index 0 = ${array1(2)}")

  println("How to initialize array with capacity")
  val array2 =new Array[String](3)
  array2(0) ="Plain Donut"
  array2(1) ="Chocolate Donut"
  array2(2) ="StrawBerry Donut"
  println(s"Element of array2 is :${array2.mkString(",")}")

  println("\nHow to Create a 2D Array (2 dimension array")
  val rows = 2
  val columns = 2
  val array3 = Array.ofDim[String](rows,columns)

  array3(0)(0) ="Plain"
  array3(0)(1) ="Donut"
  array3(1)(0) ="StrawBerry"
  array3(1)(1) ="Donut"

  println(s"Element of 2 dimensional array =${array3.deep.toList}")

  println("How to create a array using tabulate function")
  val array4 = Array.tabulate(5) (_+1)
  println(s"Array of 5 columns = ${array4.toList}")

  println("How to create an array using range ")
  val rangeArray =(1 to 10).toArray[Int]
  println(s"Array range will be in ${rangeArray.mkString}")



}
