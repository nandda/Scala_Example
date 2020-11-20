package Scala_Functions

object Aggregate_Func extends App{

  println("How to initialize set of type of string as a set")
  val donutBasket1 = Set("Plain Donut","StrawBerry Donut")
  println(s"Elements from donutBasket1 is ${donutBasket1}")


  println("How to define an accumulator to calculate the total length of string")

  def donutAccumulator(accumulator:Int,donutName:String): Int =  {
    val accum1 = accumulator + donutName.length
    accum1
  }

  val totalLength = donutBasket1.aggregate(0)(donutAccumulator,_+_)
  println(s"totalLength is : ${totalLength}")
}
