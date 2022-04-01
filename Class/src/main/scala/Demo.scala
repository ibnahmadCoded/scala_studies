class User(private var name1: String, var name: String, var age: Int){
  def printName{ println(name1) }
}

object Demo {

  def main(args:Array[String]): Unit ={
    var user = new User("Max", "Al", 28)

    println(user.name)
    println(user.age)

    user.name = "Ali"
    user.age = 100000

    println()
    println(user.name)
    println(user.age)
    println(user.printName)
  }
}
