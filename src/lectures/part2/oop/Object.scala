package lectures.part2.oop

object Object extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")
  object Person { //type + its only instance
    //"static"/"class"-level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person (val name: String) {
    //instance-level functionality
  }

  //class and object are COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object is a SINGLETON INSTANCE
  val mary = new Person("Mary")
  val john = new Person("John")
  println(mary == john) //false

  val person1 = Person
  val person2 = Person
  println(person1 == person2) //it says true, they point to the same instance -> Object called "Person"

  val bobbie = Person(mary, john)

    //Scala Applications = Scala object with
    // def main(args: Array[String]): Unit
}
