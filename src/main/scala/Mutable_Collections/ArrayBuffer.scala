package Mutable_Collections




object ArrayBuffer_Mutable extends App {


  import scala.collection.mutable.ArrayBuffer
  println("Step 1:How to initialize an Array buffer with 3 elements")
  val arrayBuffer1 :ArrayBuffer[String]= ArrayBuffer("Plain Donut","StrawBerry Donut","Chocolate Donut")
  println(s"Elements of ArrayBuffer1 =$arrayBuffer1")
}
