package Class_and_Objects

object CaseClass_vs_Type_alias  extends App {

  case class Donut(name:String,price:Double,productCode:Option[Long] =None)

  println("How to create a instances or objects for the Donut case class")
  val vanillaDonut  = Donut("Vanilla",1.50)
  val glazedDonut   = Donut("Glazed",2.0)

  println(s"Vanilla Donut ${vanillaDonut}")
  println(s"glazed Donut ${glazedDonut}")


  println("How to use type alias to name a tuple2 pair into a domain type called cartItem")
  type CartItem[Donut,Int] = (Donut, Int)

  println("How to create an instances of the aliased type cartItem")
  val cartItem = new CartItem(vanillaDonut,4)
  println(s"CartItem =${cartItem}")
  println(s"cartItem first value =${cartItem._1}")
  println(s"cartItem second value =${cartItem._2}")


  println("how to use  a type aliased function as a parameter")
  def calculateTotal(shoppingCartItems:Seq[CartItem[Donut,Int]]): Double = {
    shoppingCartItems.foreach {
      cartItem =>
        println(s"cartItem donut =${cartItem._1},quantity =${cartItem._2}")
    }
    10
  }

  println("How to use case class instead of aliased type ")
case class ShoppingCartItem(donut:Donut,quantity:Int)

  val shoppingCartItem =ShoppingCartItem(Donut("Glazed Donut",2.50),1)

  println(s"shoppingItem Donut = ${shoppingCartItem.donut}")
  println(s"ShoppingItem Donut =${shoppingCartItem.quantity}")

}
