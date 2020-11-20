package Functions

object FunctionsFun extends App {

  println("\n Step 1: How to define a function with variable number of arguments")

  def printReport(donutNames:String*): Unit = {
    println(s"Donut Report = ${donutNames.mkString(",")}")
  }

println("\n Step 2: How to call a function which takes a variable number of arguments")
  printReport("Glazed Donut\", \"Strawberry Donut\", \"Vanilla Donut");
  printReport("Chocolate donut")
  printReport()

  println("\n Step 3: How to pass through a Seq,List,Array into a function with variable number of arguments")
  val listDonuts = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport(listDonuts:_*)

  val seqDonuts = Seq("Chocolate Donut","Plain Donut")
  printReport(seqDonuts:_*)

  val arrayDonuts = Array("Coconut Donuts")
  printReport(arrayDonuts:_*)



}
