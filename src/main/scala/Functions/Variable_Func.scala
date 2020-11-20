package Functions

import scala.collection.mutable

object Variable_Func extends App {

  def printReport(name:String*): Unit = {
    println(s"Donut Report =${name.mkString("-")}")
  }

  println(s"\n How to call a function which takes variable number of String arguments")



  printReport("Glazed Donut","StrawBerry","vanilla Donut")
  printReport("Chocolate Donut")


  println("\nStep 3:How to pass a List to a function with variable number of arguments")
  val listDonuts :List[String] = List("Glazed Donut","Strawberry Donut","Vanilla Donut")

  printReport(listDonuts:_*)

  println("\nStep 4:How to pass a Seq to a function with variable number of arguments")
  val seqDonuts:Seq[String] = Seq("chocolate Donut","Plain Donut")
  printReport(seqDonuts:_*)

  println("\nStep 5:How to pass a Array to a function with variable number of arguments")
  val arrayDonuts = Array("coconut Donut")
  printReport(arrayDonuts:_*)


}
