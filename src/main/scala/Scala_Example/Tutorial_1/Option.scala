package Scala_Example.Tutorial_1

object Option extends App {

  println("Step 1:How to use Option and none - a basic Example")
  val glazeDonutTaste: Option[String] = Some("Very Tasty")
  println(s"Glazed Donut taste =${glazeDonutTaste.getOrElse()}")


  println("\nStep 2: How to use Option and None - a basic example")
  val glazedDonutName: Option[String] = None
  println(s"Glazed Donut taste =${glazedDonutName.getOrElse("Glazed Taste")}")

println("\nStep 3: How to use option and none in pattern matching")
  glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None => println(s"No donuts are found")
  }

  println("\nTip: Filter None using map function")
  glazeDonutTaste.map(taste => println(s"$taste"))
  glazedDonutName.map(name => println(s"$name"))

}