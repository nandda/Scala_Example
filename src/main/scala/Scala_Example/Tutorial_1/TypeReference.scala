package Scala_Example.Tutorial_1

object TypeReference extends App{

  println("Step 1: immutable value")
  val donutsToBuy :Int = 5
  val donutsBought = 5

  println("\nStep 2: Scala Supported Types")
  val boolEatingDonut = true
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()


  println("step 3 : Using scala complier to convert from one data type to another")

  val numberOfDonuts :Short = 1
  val minimumDonutsToBuy:Int = numberOfDonuts


  println("Manual conversion from one data tpye to another")

  val minimumDonutsToSell:String = numberOfDonuts.toString
  val minimumDonutsToShort = minimumDonutsToSell.toShort
  val minimumDonutsToLong = minimumDonutsToSell.toLong


}
