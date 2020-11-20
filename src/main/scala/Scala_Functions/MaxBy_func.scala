package Scala_Functions

object MaxBy_func extends App {
  println("Step 1: How to create a case class to represent Donut object")
  case class Donut(name: String, price: Double)

  println("\nStep 2: How to create a Sequence of type Donut")
  val donuts: Seq[Donut] = Seq(Donut("Plain Donut", 1.5), Donut("Strawberry Donut", 2.0), Donut("Glazed Donut", 2.5))
  println(s"Elements of donuts = $donuts")



  println("\nStep 3: How to find the maximum element in a sequence of case classes objects using the maxBy function")
  println(s"Maximum element in sequence of case class of type Donut, ordered by price = ${donuts.maxBy(donuts=> donuts.price)}")

}
