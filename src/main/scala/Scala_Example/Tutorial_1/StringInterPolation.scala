package Scala_Example.Tutorial_1

object StringInterpolation extends App{

  println("Using string interpolation to print variable")
  val favouriteDonut = "Glazed Donuts"
  println(s"MyFavouriteDonuts = $favouriteDonut")

println("Using String interpolation on object properties")
  case class Donut(name:String,tasteLevel:String)
  val favouriteDonut2 = Donut("Glazed Donuts","Very Tasty")
println(s"My favourite Donut Name = ${favouriteDonut2.name}, tasteLevel = ${favouriteDonut2.tasteLevel}")


  println("Using string interpolation to evalute expression")
  val qtyDonutsToBuy =10
  println(s"are you buying 10 donuts = ${qtyDonutsToBuy==10}") // if this condition meets then its print true

  println("\nStep 4: Using String interpolation for formatting text")
  val donutName = "Vanilla Donut"
  val donutTasteLevel = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")


  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice = 2.50
  println(f"Donut price = $donutPrice%.2f") //string s is not used for print the floating values so need to use the f

  println("\nStep 6: Using raw interpolation")
  println(f"Favorite donut\t$donutName")
}
