package `trait`


trait DonutShoppingCartDao {
println("Create a trait which will define a methods")

  def add(donutName:String) :Long
  def update(donutName:String):Boolean
  def search(donutName:String):String
  def delete(donutName:String):Boolean
}

class DonutShoppingCart extends DonutShoppingCartDao {
  override def add(donutName: String): Long = {
    println(s"DonutShoppingCart-> add method -> donutName:$donutName")
  1
  }

  override def update(donutName: String): Boolean = {
    println(s"DonutShoppingCart-> update method -> donutName: $donutName")
    true
  }

  override def search(donutName: String): String = {
    println(s"DonutShoppingCart-> search method -> donutName: $donutName")
    donutName
  }

  override def delete(donutName: String): Boolean = {
    println(s"DonutShoppingCart-> delete method -> donutName: $donutName")
  true
  }
}


object DonutShopping extends App {
  println("Create an instance of DonutShoppingCart and call the add,update,delete and search methods")
  val donutShoppingCart1 = new DonutShoppingCart
  donutShoppingCart1.add("Vanilla Donut")
  donutShoppingCart1.delete("Vanilla Donut")
  donutShoppingCart1.search("Vanilla Donut")
  donutShoppingCart1.update("Vanilla Donut")
}