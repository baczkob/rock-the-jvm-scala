package lectures.part2.oop

object MethodNotations extends App {

  class Person (val name: String, favouriteMovie: String, val age: Int = 0){
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def hangOutWith(nick: String) = new Person(s"$name ($nick)", favouriteMovie, age)
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person (name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala(): String = this learns "Scala"
    def apply(): String = s"Hello, my name is $name and I like $favouriteMovie"
    def apply(count: Int): String = s"$name watched $favouriteMovie $count times"
  }

  val mary = new Person ("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //those two are equivalent
  //infix notation = operator notation, works only with methods having single parameter
  //(an example of syntactic sugar)

  //"operators" in Scala
  val tom = new Person("Tom", "Fight Club", 40)
  println(mary hangOutWith tom)
  println((mary hangOutWith "the Rockstar")()) //using apply() also here

  //ALL OPERATORS ARE METHODS
  println(1 + 2)
  println(1.+(2))

  //prefix notation
  val x = -1 // ("-" is a unary operator)
  val y = 1.unary_- //-1
  //unary_ prefix works only with - + ~ !

  println(!mary)
  println(mary.unary_!)
  println((+mary).age)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive) //gets Scala closer to natural language
  println(mary learnsScala)

  // apply
  println(mary.apply())
  println(mary()) //the same as above, "apply" is a specific method for Scala
  println(mary(2))

  /*
  1. Overload the hangoutWith
      mary + "the rockstar" => new person "Mary (the rockstar)"
  2. Add an age to the Person class
      Add a unary + operator => new person with the afe + 1
      +mary => mary with age incrementer

  3. Add a "learns" method in the Person class => "Mary learns Scala"
     Add a learnsScala method, no parameters, calls learns with "Scala" arguemtn
     Use it in Postfix notation

  4. Overload the apply method
     Mary.apply(2) => "Mary watched favMovie 2 times"
   */
}
