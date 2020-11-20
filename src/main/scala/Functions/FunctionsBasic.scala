package Functions

object FunctionsBasic extends App {


  println("Step 1: How to define and use a function which a return Type")
  def favouriteDonut(): String = {
    "Glazzed Donuts"
  }

  val myfavouriteDonuts = favouriteDonut()
  println(s"My favourite donut is $myfavouriteDonuts")

println("Step 2:How to define and use a function with no parenthesis")
  def leastFavouriteDonut = "Plain Donut"
  println(s"My favourite donut is $leastFavouriteDonut")

  def printDonutSalesReport() = {
    println("Printing donut sales report ...done!")
  }

  printDonutSalesReport()

  println("Step 3: How to define and use function with parameters")

  def calculateDonuts(donutName:String,quality:Int): Double = {
    println(s"Calculating cost for $donutName, quality = $quality")
    2.50 * quality
  }

  println("\nStep 5: How to call a function with parameters")
  val totalCost = calculateDonuts("Glazed Donut", 5)
  println(s"Total cost of donuts = $totalCost")

  println("\nStep 5:How to add a default value to functions")
  def calculateDonutCost(donutName:String, quantity:Int,couponCode:String = "No Code"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
    2.50 * quantity
  }
  println("\nStep 7: How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateDonutCost("Glazed Donut", 4, "COUPON_12345")
  println(s"totalcost for : ${totalCostWithDiscount}")
  val totalCostWithoutDiscount = calculateDonutCost("Glazed Donut", 4)
  println(s"totalcost for : ${totalCostWithoutDiscount}")
}
