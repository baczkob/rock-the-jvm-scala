package lectures.part2.oop

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
     val creatureType: String = "Canine"
     def eat: Unit = println("om nom nom")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "Croc"
    def eat: Unit = println("mlask, mlask")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  // 1. traits don't have constructor parameters
  // 2. You can inherit multiple traits by the same class
  // 3. Traits = behavior, abstract class = type of thing
}
