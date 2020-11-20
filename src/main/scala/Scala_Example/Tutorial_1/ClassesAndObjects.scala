package Scala_Example.Tutorial_1

object ClassesAndObjects extends App {

  println("Step 1: How to define a simple class to represent a Donut Objects")
  class Donut(name:String,productCode :Long) {

    def print() = {
      println(s"Donut Name =$name,productCode=$productCode")
    }
  }

  println("\nStep 2: How to create instances of Donut class using new keyword")
  val glazzedDonut = new Donut("Glazzed Donut",1111)
  val vanillaDonut = new Donut("Vanilla Donut",2222)

  println("\nStep 3: How to call the print() method for each of the donut object")
  glazzedDonut.print()
  vanillaDonut.print()


  println("\nStep 4: How to declare a companion object for the Donut class")
  object Donut {
    def apply(name:String,productCode:Long): Unit = {
      new Donut(name,productCode)
    }
  }
  println("\nStep 5: How to create instances of the Donut class using the companion object")
  val glazedDonut2 = Donut("Glazed Donut", 1111)
  val vanillaDonut2 = Donut("Vanilla Donut", 2222)
  println("\nStep 6: How to access the properties of class Donut")

}
