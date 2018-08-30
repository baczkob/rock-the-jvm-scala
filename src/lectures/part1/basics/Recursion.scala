package lectures.part1.basics

import lectures.part1.basics.Functions.{Fibonacci, aGreetingFunction, isPrime}

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need a factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))
  println(factorial(5000)) //stack overflow error

  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factHelper(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //Tail recursion, uses only one stack
    }

    factHelper(n, 1)

    /*
    anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
      ...
    = factHelper(2, 3 * 4 * ... * 10 * 1)
    = factHelper(1, 1 * 2 * 3 * ... * 10)
    = 1 * 2 * 3 * ... * 10
     */
  }

  //Create tail recursions for:

  // String concatenation
  def concatenateTailrec(name: String, multiplier: Int, accumulator: String): String =
    if (multiplier <= 1) accumulator
    else concatenateTailrec(name, multiplier - 1, name + accumulator)

  println(concatenateTailrec("Bartek", 3, ""))

  // isPrime function
  def isPrime(number: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, number % t != 0 && isStillPrime)

    isPrimeTailrec(number / 2,true)
  }

  println(isPrime(2003))
  println(isPrime(16))

  //Fibonacci function

  def Fibonacci(fibCount: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= fibCount) last
      else fiboTailrec(i + 1, last + nextToLast, last)

      if (fibCount <= 2) 1
      else fiboTailrec(2, 1, 1)
    }

    println(Fibonacci(8))

}
