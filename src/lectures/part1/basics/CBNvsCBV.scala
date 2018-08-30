package lectures.part1.basics

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = { //x is evaluated at the definition of function
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x:  => Long): Unit = { //x is evaluated every time it's called inside the function
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
