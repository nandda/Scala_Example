package Functions

class DonutString(s:String)
{
  println("\n Step 1:How to create a wrapper class which will extends the String Type")
    def isFavouriteDonut:Boolean =s=="Glazzed Donuts"

  }

object DonutConversion extends App{
println("\n Step 2:How to create a implicit function to convert a string to wrapper string class")
  implicit def stringToDonutString(s:String) = new DonutString(s)

  println("\nStep 4: How to create String values")
  val glazedDonut = "Glazzed Donuts"
  val vanillaDonut = "Vanilla Donut"
  println("\nStep 5: How to access the custom String function called isFavaoriteDonut")
  println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavouriteDonut}")
  println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavouriteDonut}")

}