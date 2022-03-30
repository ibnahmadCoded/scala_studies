object Demo {
  var c: String = "ab"
  val str1: String = "This me experimenting strings in Scala"
  val str2: String = " in Singapore"
  val num1 = 75
  val num2 = 100.5

  def main(args: Array[String]): Unit ={
    println(str1.length())  //getting number of characters in a string
    println(str1.concat(str2))  //string concatenation
    println(str1 + str2)  //string concatenation
    c = "cd"
    println(c)
    val res = printf("(%d -- %f -- %s)", num1, num2, str2)  //string formatting
    println(res)
    println("(%d -- %f -- %s)".format(num1, num2, str2))
    printf("(%d -- %f -- %s)", num1, num2, str2)
  }
}
