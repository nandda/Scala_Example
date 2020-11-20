package Scala_Example.Tutorial_1

object ComprehensionAndLoop extends App{

  println("Simple for loop from 1 to 5 inclusive")
for(numberOfDonuts <- 1 to 5) {
  println(s"Number of donuts to buy =$numberOfDonuts")
}

  println("\n Step 2: A simple for loop from 1 until 5,where 5 is not exclusive")
  for(numberOfDonuts <- 1 until 5){
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

  println("\n Step 3:Filter values using if condition in for Loop")
  val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
  for(numberOfDonuts <- donutIngredients if(numberOfDonuts =="sugar")) {
    println(s"Number of donuts picked by using if_con : ${numberOfDonuts}")
  }

  println("\nStep 4:Filter values using if conditions in for loop and return back using yield keyword")
  val SweeteningIngredients = for {
    ingredients <- donutIngredients
     if ingredients == "sugar" || ingredients =="syrup"
  } yield  ingredients
  println(s"Sweetening ingredients = $SweeteningIngredients")

println("\n Step 5:Using for comprehension to loop 2-dimensional Array ")

  val twoDimensionalArray = Array.ofDim[String](2,2)
  twoDimensionalArray(0)(0) ="flour"
  twoDimensionalArray(0)(1) ="sugar"
  twoDimensionalArray(1)(0) ="egg"
  twoDimensionalArray(1)(1) ="syrup"

  for {
    x <- 0 until 2
    y <-0 until 2
  } println(s"Remaining donuts to be baked =${twoDimensionalArray(x)(y)}")

println("\n Step 7: Use foldLeft Function to count number of donuts")
  val donutsToBake = List("plain","vanilla","chocolate","stawberry","glazed")
  val numberOfDonutsBaked = donutsToBake.foldLeft(0)
  {(count,donut) =>
    println(s"baking donut =$donut")
    count +1
  }
println(s"number of donuts to bake =$numberOfDonutsBaked")


  println("\n Step 7: Use foldRight Function to count number of donuts")
 val numberOfDonutsBakedFoldRight = List("plain","vanilla","chocolate","stawberry","glazed")
val donutsBreak = donutsToBake.foldRight(0)
  {(donuts,count) => (s"baking donut =$donuts")
    count +1
  }
  println(s"number of donuts to bake =$numberOfDonutsBakedFoldRight")



  val numberOfDonutsBaked2 = donutsToBake.foldLeft(0)((count,_) => count +1)
  println(s"number of donuts to bake = $numberOfDonutsBaked2")

  def calculateToBake(list:List[Any]) = list.foldLeft(0)((count,_) => count + 1)

  val numberOfDonutsToBake = calculateToBake(donutsToBake)
  println(s"number of donuts to bake = $numberOfDonutsToBake")

}
