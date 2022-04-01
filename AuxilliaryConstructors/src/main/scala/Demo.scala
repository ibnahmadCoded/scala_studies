object Demo {
  class User(var name: String, var age: Int){
    // create an auxiliary constructors

    def this(){
      this("Tom", 32)
    }

    def this(name: String){
      this(name, 32)
    }
  }

  def main(args: Array[String]): Unit ={
    var user1 = new User("Max", 22)
    var user2 = new User()
    var user3 = new User("Maxim")

    println(user1.name)
    println(user2.name)
    println(user3.name)
  }
}
