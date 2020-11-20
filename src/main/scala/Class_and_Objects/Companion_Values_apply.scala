package Class_and_Objects

class Companion_Values_apply(name:String, productCode:Option[Long] = None) {

 println(s"name of the donut is ${name},productCode = ${productCode.getOrElse(0)},uuid =${Companion_Values_apply.uuid}")


}


object Companion_Values_apply extends App {

  private val uuid = 1

  def apply(name: String, productCode: Option[Long]): Companion_Values_apply = {
    new Companion_Values_apply(name, productCode)
  }

  def apply(name: String): Companion_Values_apply = {
    new Companion_Values_apply(name)
  }

  val glazedDonut = Companion_Values_apply("Glazed Donut",Some(1111))
  val vanillaDonut =Companion_Values_apply("Vanilla Donut")


}