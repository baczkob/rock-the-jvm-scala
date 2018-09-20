package lectures.part2.oop

object OOBasics extends App {

  val person = new Person("Bartek", 30)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()

  val Poe = new Writer("Edgar Allan", "Poe", 1800)
  val Crow = new Novel("The Crow", 1843, Poe)

  Poe.fullname()
  Crow.authorAge()
  Crow.isWrittenBy()

  val myCounter = new Counter(10)
  myCounter.inc(4).print
  myCounter.inc.print
  myCounter.dec(7).print



}

//constructor
class Person(name: String, val age: Int) {
  //body
  val x = 2 //this is a class field

  println(x + 1)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  //auxiliary constructor can call only other constructor
  def this(name: String) = this(name, 0)
}
  //it's generally better to supply default value for parameter
//class parameters are NOT FIELDS
//adding "val/var" makes parameter a field

  /*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullname, returns concat


  Novel: name, year of release, author
    - method authorAge, age of author in the year of release
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel
   */

class Writer (name: String, surname: String, val year: Int) {

    def fullname(): String =  name + " " + surname
}

class Novel (name: String, yearOfRelease: Int, author: Writer){

  def authorAge(): Unit = println(s"When ${this.name} was released, " +
      s"${author.fullname()}  was " + (yearOfRelease - author.year) + " old")

  def isWrittenBy(): Unit = println(name + " is written by " + author.fullname())

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int
    - method current count
    - method increment/decrement => new Counter
    - overload inc/dec to receive an amount
   */

class Counter (val count: Int) {
  def inc = new Counter(count + 1) //immutability, we get a new instance of Counter here
  def dec = new Counter(count - 1)

  def inc (n: Int) = new Counter (count + n)
  def dec (n: Int) = new Counter (count - n)

  def print = println(count)
}







