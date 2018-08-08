package lectures.part1.basics

object Expressions extends App{

  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4)

  println(x == 1)

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  //Instructions (DO) vs Expressions (VALUE)

  //IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  //usage of loops is discouraged????
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  //NEVER WRITE THIS AGAIN --> avoid while and looping like plague; there are other ways to iterate

  //EVERYTHING in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning --> remainders of imperative programming, they return Unit

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y +1

    if (z > 2) "hello" else "goodbye"
  }

}
