package Functions

object CreateFuncCurryBracket extends App{

  println("Step 1:How to define function with curried parameter groups")

  def totalCost(donutType:String)(quantity:Int)(discount:Double): Double = {
    println(s"calculating the totalcost for $quantity, $quantity with $discount")

    val totalcost = quantity *2.50
    totalcost -(totalcost*discount)
  }
  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut")_
}
