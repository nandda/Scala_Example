package `trait`

trait DonutShoppingCartDaoType[A] {

  def add(donut:A):Long
  def update(donut:A):Boolean
  def search(donut:A):A
  def delete(donut:A):Boolean
}

class DonutShoppingCart2[A] extends DonutShoppingCartDaoType[A] {
  override def add(donut: A): Long = {
    println(s"DonutShoppingCart-> add method -> donut: $donut")
    1
  }

  override def update(donut: A): Boolean = {
    println(s"DonutShoppingCart-> update method -> donut: $donut")
    true
  }

  override def search(donut: A): A = {
    println(s"DonutShoppingCart-> search method -> donut: $donut")
    donut
  }

  override def delete(donut: A): Boolean = {
    println(s"DonutShoppingCart-> delete method -> donut: $donut")
    true
  }
}

object DonutShopping2 extends App {

  val donutShoppingCart1 = new DonutShoppingCart2[String]()
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.delete("vanilla Donut")




}