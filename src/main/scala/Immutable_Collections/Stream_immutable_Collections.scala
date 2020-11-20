package Immutable_Collections

import scala.collection.immutable.Stream.cons

object Stream_immutable_Collections extends App {

  println("Step 1:How to create a Stream with 3 numbers using #::")
  val stream1 = 1 #:: 2 #:: 3 #:: Stream.empty
  println(s"Element of stream 1 =${stream1}")

  println("Step 2: How to create a Stream with 3 numbers using cons")
  val stream2 =  cons(1,cons(2,cons(3,Stream.empty)))
  println(s"Element of stream 2 =${stream2}")

  stream2.take(3).print()

  println("\nStep 3:How to define an infinite Stream of numbers using stream cons ")
  def infiniteNumberStream(number:Int) :Stream[Int] = Stream.cons(number,infiniteNumberStream(number+1))
  println("Take only the first 20 numbers from the infinite streams")
  infiniteNumberStream(1).take(20).print()

  println("\n Step 4:How to define an infinite Stream of numbers using From func")
  val stream3:Stream[Int] = Stream.from(1)
  stream3.take(10).print()
 }
