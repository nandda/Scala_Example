package Functions

object PolymorphicFunc extends App {

  println("\nStep 1: Review How to define a generic type function which will specify the type of the parameters")
  def applyDiscount[T](discount :T): Unit = {
    discount match {
      case d:String =>
        println(s"Lookup percentage discount in database for $d")
      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")

    }
  }

  applyDiscount("couponCode_1234")
  applyDiscount(12.43)



  println("\nStep 1: Review How to define a generic polymorphic type function which will specify the type of the parameters")
  def applyDiscountWithReturnType[T](discount :T): Seq[T] = {
    discount match {
      case d:String =>
        println(s"Lookup percentage discount in database for $d")
        Seq[T](discount)
      case d: Double =>
        println(s"$d discount will be applied")
       Seq[T](discount)
      case d @_ =>
        println("Unsupported discount type")
       Seq[T](discount)
    }
  }

  println("\nStep 4: How to call a generic typed function which also has a generic return type")
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println()
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

  println()
  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")
}
