package Functions

object HigherOrderFunctions extends App {


/*  println("Step 1: Review how to define function with curried parameter groups")
  def totalCost(donutType: String)(quantity: Int)(discount:Double): Double = {
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println(s"totalCost of ${totalCost("Glazzed Donut")(5)(0.2)}")*/

println("Step 1:How to define a List with tuple 3 elements")
  val listOfOrders = List(("Glazzed Donut",5,2.50),("Vanilla Donut",10,3.50))

  println("\nStep 2: How to define a function to loop through each Tuple3 of the List and calculate total cost")

def totalCost(orders: List[(String,Int,Double)])(exchangeRate:Double): Double = {
  var totalCost :Double = 0.0
  orders.foreach {orders =>
    val costOfItem = orders._2 * orders._3 * exchangeRate
    println(s"Cost of ${orders._2} ${orders._3} =$costOfItem")
    totalCost += costOfItem
  }
  totalCost

}

  println(s"TotalCost of ${totalCost(listOfOrders)(2.5)}")
}