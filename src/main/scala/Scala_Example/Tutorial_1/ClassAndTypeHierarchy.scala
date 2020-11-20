package Scala_Example.Tutorial_1

object ClassAndTypeHierarchy extends App{

  //http://allaboutscala.com/tutorials/chapter-2-learning-basics-scala-programming/scala-tutorial-learn-scala-class-type-hierarchy/
  //Any => can work with any kind of variables such as int,string,objects,null
  //AnyRef => {java.lang.object},List,object,yourclass
  //AnyVal => int,short,long,float,double

  println("Declare immutable values of type Any")
  val favouriteDonuts :Any = "Glazed Donuts"

  println(s"favouriteDonuts of type any = $favouriteDonuts")

  println("Declare immutable values of type AnyRef")
  val donutName :AnyRef = "Glazed Donuts"

  println(s"donut name of Type AnyRef = $donutName")

  println("Declare an immutable value of type AnyVal")
  val donutPrice :AnyVal = 2.50

  println(s"donutPrice of type AnyVal =$donutPrice")

}
