package lectures.part2.oop

object OOBasics extends App {

  val person = new Person("Bartek", 30)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

//constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2 //this is a class field

  println(x + 1)

  //method
  def greet (name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  //auxiliary constructor can call only other constructor
  def this(name: String) = this(name, 0)

  //it's generally better to supply default value for parameter

  /*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname, returns concat

  Novel: name, year of release, author
    - method authorAge, age of author in the year of release
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
   */

  /*
  Counter class
    - receives an int
    - method current count
    - method increment/decrement => new Counter
    - overload inc/dec to receive an amount
   */
}


//class parameters are NOT FIELDS
//adding "val/var" makes parameter a field
