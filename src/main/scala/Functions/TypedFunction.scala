package Functions

object TypedFunction extends App{

  println(s"Step 1: How to define a function which takes String as a parameter")
  def applyDiscount(couponCode:String): Unit = {
    println(s"Lookup percentage discount in database for $couponCode")
  }
  println(s"Step 1: How to define a function which takes Double as a parameter")
  def applyDiscountDouble(percentageCount:Double): Unit = {
    println(s"Lookup percentage discount in database for $percentageCount")
  }

  println(s"Calling apply discount function with string or double parameter types")
  applyDiscount("CouponCode_1234")
  applyDiscountDouble(20.0)


  println(s"\nStep 4:how to define generic type function which will specify the type of parameters")
  def applyDiscount[T](discount:T): Unit = {
    discount match {
      case d:String =>
        println(s"Lookup percentage discount in database for $d")
      case d:Double =>
        println(s"$d discount will be applied")
      case _ =>
        println("UnSupported discount type")
    }
  }
applyDiscount("hello")
  applyDiscount(20.5)
  applyDiscount(2.5f)
}
