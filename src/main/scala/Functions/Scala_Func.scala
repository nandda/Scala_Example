class Person {
  def sayHello() = {
    print("Hello \n")
  }
}

object HelloWorld {
  def main(args:Array[String]) = {
    val person = new Person()
    person.sayHello()
    println("Hello World")
   //Variable declaration
    var name:String ="Bob"
    name ="Fred"
    println(name)

    //forLoop
    for(i <- 0 until 10)  {
      println(i)
    }

    val list = List(0,1,2,3,4,5,6,7,8,9,10)
    list.filter(x=> x % 2 ==0).foreach(x=>println(x))

    //tuple
    val person1 =("Alice",12)
     println(person1._1)
     println(person1._2)

    //Array
    val array = Array(1,2,3,4,5)
    array.foreach(x=>println(x))


    //formatted output //string interpolation
    val name1="Alice"
    val age = 12

    val output = s"$name1 is $age years old"
    println(output)
    println(s"$name is $age years old")

    //inline operations
    println(s"$name1 is ${age * 2} years old ")

  }
}




