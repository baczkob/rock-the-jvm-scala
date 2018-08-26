package lectures.part1.basics

object Functions extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b


  println(aFunction("hello", 3))

  def aParametlessFunction(): Int = 42
  println(aParametlessFunction())
  println(aParametlessFunction) // parametless can be called withour ()

  def aRepeatedFunction(aString: String, n: Int): String = {

    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  // A greeting function (name, age) -> "Hi, my name is $name and I am $age years old
  def aGreetingFunction(name: String, age: Int): Unit = println(s"Hi, my name is $name and I am $age years old")
  aGreetingFunction("Bartek", 25)

  // Factorial function 1 * 2 * 3 * .. * n
  def Factorial(number: Int): Int = {
    if (number <= 1) 1
    else number * Factorial(number - 1)
  }
  println(Factorial(10))

  // A Fibonacci function f(1) = 1 f(2) = 1 f(n) = f(n - 1) + f(n - 2)
  def Fibonacci(fibCount: Int): Int = {
    if (fibCount <= 2) 1
    else Fibonacci(fibCount - 1) + Fibonacci(fibCount - 2)
  }
  println(Fibonacci(8))

  // Test if number is prime
  def isPrime(number: Int): Boolean =
    if (number <= 3 && number > 0) true
    else if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) true
    else false

  println(isPrime(16))
}

//compiler can also infer function return type sometimes