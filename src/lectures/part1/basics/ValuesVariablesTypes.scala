package lectures.part1.basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)

  //vals are immutable
  // types are infered

  val aString: String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'

  var aVariable: Int = 4
  aVariable = 6
  println(aVariable)

}
