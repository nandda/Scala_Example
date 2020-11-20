package Class_and_Objects

class Donut(name:String,productCode:Long) {
println("how to define a simple class to represent a donut objects")
def print =println(s"Donut name =$name,productCode =$productCode")
}

object Donut extends App {
  def apply(name:String,productCode:Long): Donut =
    new Donut(name,productCode)

println("\nStep 3:How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut",1111)
  val vanillaDonut =Donut("Vanilla Donut",2222)

  glazedDonut.print
  vanillaDonut.print
}
