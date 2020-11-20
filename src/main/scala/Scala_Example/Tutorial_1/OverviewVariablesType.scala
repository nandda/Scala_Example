package Scala_Example.Tutorial_1

object OverviewVariablesType extends App {


  //Overview of variables:
  //mutable
  //immutable
  //variables types
  //variables without default values.



  println("Step:1 immutable variables")

  val donutsToBuy = 5

  //donutsToBuy = 10 // you will get compile error because donutToBuy is immutable

  println("\n Step:2 : Mutable Variables")

  var favouriteDonuts = "Glazed Donuts"

  favouriteDonuts ="vanilla Donuts" // its wonts throws error because its mutable variables

  println(s"our favouriteDonuts is : ${favouriteDonuts}")


  println("Declare variables without default value :")

  var leastFavouriteDonuts:String = _

  leastFavouriteDonuts = "plain donuts"

  println(s"the least donuts are ${leastFavouriteDonuts}")

 println("step 4: lazy initialization ")

  lazy val donutService = "initialize some donuts service" //lazy is not allowed in mutable values.

  println(donutService)

  println("Scala supported types")
  val boolEatingDonuts  = true
  val donutsBought = 5
  val bigNumberOfDonuts = 1000000000L
  val smallNumberDonuts = 1
  val priceOfDonuts = 2.50
  val donutsPrice = 2.50f
  val donutsStoreName = "Donut Store"
  val donutsByte = 0xa
  val donutFirstLetter = 'D'
  val donutNothing :Unit = ()


}
