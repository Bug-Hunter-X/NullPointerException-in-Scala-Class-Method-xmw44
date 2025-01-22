```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"My name is $name")
  }
}

object Main extends App {
  val myObject = new MyClass("John")
  myObject.printName() // This will print "My name is John"

  val myObject2 = new MyClass(null)
  myObject2.printName() // This will throw NullPointerException 
}
```