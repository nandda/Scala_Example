package Scala_Example.Tutorial_1

object PatternMatching extends App{

  println("Step 1 :Pattern Matching 101 - a very basic Example")

  val donutType ="Glazzed Donut"
  donutType match {
    case "Glazzed Donut" => println("Very tasty")
    case "Plain Donut"   => println("Tasty")
  }

  println("Step 2:Pattern Matching with Result")
  val tasteLevel = donutType match {
    case "Glazzed Donut" => "Very Tasty"
    case "Plain Donut"   => "Tasty"
  }
  print(s"The tastLevel of $donutType = ${tasteLevel}")


  println("\nStep 3:Pattern Matching using wildcard operator")
  val tasteLevel2 = donutType match {
    case "Glazzed Donut" => "Very Tasty"
    case "Plain Donut"   => "Tasty"
    case _              => "Tasty"
  }
   println(s"the Taste Level of $donutType is ${tasteLevel2}")

println("\n Step 4: Pattern matching with one or more items on the same condition")
  val tasteLevel3 = donutType match {
    case "Glazzed Donut" | "Strawberry Donut" => "Very Tasty"
    case "Plain Donut"  => "Tasty"
    case _ => "Tasty"
  }
  println(s"the taste Level of $donutType is ${tasteLevel3}")

  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val tasteLevel4 = donutType match {
    case donut if donut.contains("Glazzed") || donut.contains("Strawberry") => "Very Tasty"
    case "Plain Donuts" => "Tasty"
    case _ => "Tasty"
  }
  println(s"the taste Level of $donutType = $tasteLevel4")

  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  priceOfDonut match  {
    case price :Int=> "Int"
    case price :Double=> "Double"
    case price :Float=> "Float"
    case price :String=> "String"
    case price :Boolean=> "Boolean"
    case price :Char=> "Char"
    case price :Long=> "Long"
  }
  println(s"Donut price type = $priceOfDonut")

}
