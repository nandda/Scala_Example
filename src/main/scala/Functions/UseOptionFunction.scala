package Functions

object UseOptionFunction extends App {

  println(s"\n Step 1: How to define a option in function parameter")

  def calculateDonutCost(donutName:String,quantity:Int,couponCode:Option[String]) = {
    println(s"calculating cost for $donutName,quantity = $quantity")

    couponCode match  {
      case Some(name) =>
        val discount = 0.2
        val totalcost = 2.50 *quantity *(1-discount)
        totalcost

      case None => 2.50 *quantity
    }
  }

  println("\nStep 2: How to call a function which has an Option parameter")
  println(s"Total Cost - ${calculateDonutCost("Glazzed Donuts",5,Some("coupon_code=1023"))}")


  println(s"\n Step 3: How to assign default value to Option parameter")
  def CalculateCostWithDefaultOption(donutName:String,quantity:Int,CouponCode :Option[String] = None): Double = {
   println(s"Calculating cost for ${donutName}, $quantity,$CouponCode")

    CouponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity

    }

  }

  println(s"\n How to call a function with option parameter")
  println(s"${CalculateCostWithDefaultOption("Glazzed Donuts",5)}")
  println(s"${CalculateCostWithDefaultOption("Glazzed Donuts",5,Some("CouponCode=12345"))}")

  println("\n Use the map functions to extract a valid Option Value")
  val favouriteDonut: Option[String] = Some("Glazzed Donuts")
  favouriteDonut.map(d=> println(s"Favourite Donuts = $d"))

  val leastFavoriteDonut: Option[String] = None
  leastFavoriteDonut.map(d => println(s"Least Favorite donut = $d"))


  println(s"\n Define a Functions which returns an option of string " )
  def dailyCouponCode(): Option[String] = {
    val couponCode = "Coupon_1234"
    Option(couponCode).filter(_.nonEmpty)
  }

  println(s"\n Call the function with return type using getOrElse")
  val todayCoupon = dailyCouponCode()
  println(s"Todays coupon Code =${todayCoupon.get}")
}
