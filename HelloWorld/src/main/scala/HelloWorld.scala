object HelloWorld {
  def main(args: Array[String]): Unit ={
    val name = "mark"
    val age = 18.5
    println(s"Hello \n world")
    println("Hello \n world")
    println(raw"Hello \n world")
    println(f"$name%s is $age%f years old")
    println(s"$name is $age years old")
  }
}