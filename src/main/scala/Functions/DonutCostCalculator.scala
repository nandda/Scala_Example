package Functions

class DonutCostCalculator {

  val totalcost = 100

  def minusDiscount(discount:Double): Double =  {
    totalcost -discount
  }

  def -(discount:Double): Double = {
    totalcost -discount
  }

  def +++(taxAmount:Double): Double = {
    totalcost + taxAmount
  }

}

object DonutCostCalObj extends App {
  println("Step 1:How to create and instantiate a class ")
  val donutCostCalculator = new DonutCostCalculator()
  println("\nStep 2: How to call a function from an instantiated class")

  println(s"Calling minusDiscount() function =${donutCostCalculator.minusDiscount(10.5)}")

  println(s"Calling minusDiscount() function =${donutCostCalculator.-(10.5)}")

  println(s"Calling minusDiscount() function =${donutCostCalculator.+++(10.5)}")


}
