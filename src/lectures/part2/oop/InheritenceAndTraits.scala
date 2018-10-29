package lectures.part2.oop

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "wild"
    protected def eat = println("om nom nom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  // cat.eat
  cat.crunch

  //constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog extends Animal {
    //you can also override fields in constructor
    override val creatureType = "domestic"
    override def eat = {
     super.eat
     println("Crunch crunch")
    }
  }

  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  //type substitution -> broader: polymorphism
  val unknownAnimal: Animal = new Dog
  unknownAnimal.eat

  //overRIDING vs overLOADING

  //super

  //preventing overrides
  //1 - use final on member
  //2 - use final on the entire class
  //3 - seal the class - extends classes in THIS FILE only
}
