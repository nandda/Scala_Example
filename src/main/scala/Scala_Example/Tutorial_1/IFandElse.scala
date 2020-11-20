package Scala_Example.Tutorial_1

object IFandElse extends App{

  println("Step 1:Using an if clause")
  val numberOfPeople =20
  val donutsPerson   =2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerson}")

  println(s"\nStep 2:Using if and else clauses")
  val defaultDonutsToBuy = 8
  if(numberOfPeople > 10)
    println(s"Number of Donuts to Buy =${numberOfPeople * donutsPerson}")
  else
    println(s"Number of donuts to buy =$defaultDonutsToBuy")


  println("\nStep 3:Using if,else if and else clauses")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  }
    else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
    }

  println("\nStep 4: Using if and else clause as expression")

  val numberofDonutsToBuy =if(numberOfPeople > 10) numberOfPeople * donutsPerson else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberofDonutsToBuy")


  }
