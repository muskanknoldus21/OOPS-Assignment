package Oops1
import scala.collection.mutable.ListBuffer

object Driverqueue extends App {

  val list = ListBuffer(6, 21, 12, 23, 8, 3)
  println("Originally the Queue is: ")
  for (i <- list.indices) println(list(i)+ " " )


  var double_list = new DoubleQueue(list)           //This will double the elements in the queue
  println("\n After doubling the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")


  var squareQueue = new SquareQueue (list)       //Squaring the elements in the queue
  println("\n After squaring the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")

  squareQueue.dequeue(list)
  println("\nAfter dequeue a element in Queue: ")
  for( i <- list.indices) print(list(i)+" ")
  squareQueue.enqueue(list)
  println("\nAfter a element is enqueued: ")
  for( i <- list.indices) print(list(i)+" ")
}
