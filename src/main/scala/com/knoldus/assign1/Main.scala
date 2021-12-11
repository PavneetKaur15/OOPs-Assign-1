package com.knoldus.assign1

object Main {
  def main(args: Array[String]): Unit = {
    //methods of DoubleQueue Class
    val doubleQueue = new DoubleQueue
    println("Double Queue is as follows:")
    doubleQueue.enqueue(5)
    doubleQueue.enqueue(15)
    doubleQueue.enqueue(25)
    doubleQueue.enqueue(35)
    doubleQueue.enqueue(45)
    doubleQueue.enqueue(55)

    for (value <- doubleQueue.queue) print(value + "=>")
    println()

    doubleQueue.dequeue()
    for (value <- doubleQueue.queue) print(value + "=>")
    println()

    doubleQueue.dequeue()
    for (value <- doubleQueue.queue) print(value + "=>")
    println()

    doubleQueue.dequeue()
    for (value <- doubleQueue.queue) print(value + "=>")
    println()

    doubleQueue.dequeue()
    for (value <- doubleQueue.queue) print(value + "=>")
    println()

    //methods of SquareQueue Class
    val squareQueue = new SquareQueue
    println("Squared Queue is as follows:")
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    squareQueue.enqueue(5)
    squareQueue.enqueue(6)

    for (value <- squareQueue.queue) print(value + "=>")
    println()

    squareQueue.dequeue()
    for (value <- squareQueue.queue) print(value + "=>")
    println()

    squareQueue.dequeue()
    for (value <- squareQueue.queue) print(value + "=>")
    println()

    squareQueue.dequeue()
    for (value <- squareQueue.queue) print(value + "=>")
    println()

    squareQueue.dequeue()
    for (value <- squareQueue.queue) print(value + "=>")
    println()

  }


}
