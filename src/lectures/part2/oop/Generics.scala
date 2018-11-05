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

  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. YES. List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog)??? HARD QUESTION

  //2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] =  new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


}
