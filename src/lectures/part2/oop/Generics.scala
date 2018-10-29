package lectures.part2.oop

object Generics extends App {

  class MyList[A]{
    //use the type A
  }

  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = new MyList[A]
  }
}
