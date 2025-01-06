```scala
class MyClass(val name: String) {
  def greet(): String = {
    println(s"Hello, my name is $name")
    return name
  }
}

 object Main extends App {
  val obj = new MyClass("John")
  val result = obj.greet()
  println(result)
}
```