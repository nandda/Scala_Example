package Class_and_Objects

class Simple_class_donut(name:String,productCode:Long) {

  def print =println(s"Donut name =$name,productCode=$productCode")

}

object Donut_obj extends App {
  println("\nStep 2:How to create instances of Donut class")
  val glazeDonut = new Donut("Glazed Donut",1111)
  val vanillaDonut = new Donut("Vanilla Donut",2222)

glazeDonut.print
}