```scala
class MyClass(val name: String) {
  def greet(): String = {
    val greeting = s"Hello, my name is $name"
    println(greeting)
    greeting // Explicitly return the greeting string
  }
}

object Main extends App {
  val obj = new MyClass("John")
  val result = obj.greet()
  println(result)
}

//Preferred functional approach
object MainFunctional extends App{
  val greet: String => Unit = name => println(s"Hello, my name is $name")
  greet("John")
}
```