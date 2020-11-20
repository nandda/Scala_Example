package Class_and_Objects

class Companion_Apply(name: String,productCode:Option[Long]=None) {

  def print = println(s"Donut name=$name,productCode=$productCode.get")

}

class GlazedDonut(name:String) extends Companion_Apply(name)
class VanillaDonut(name:String) extends Companion_Apply(name)


object Companion_Apply extends App {

  def apply(name: String): Companion_Apply ={
  name match {
    case "Glazed Donut" => new GlazedDonut(name)
    case "Vanilla Donut" => new VanillaDonut(name)
    case _ => new Companion_Apply(name)
  }
  }


  val glazedDonut = Companion_Apply("Glazed Donut")
  println(s"The class type of glazed Donut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Companion_Apply("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print
}