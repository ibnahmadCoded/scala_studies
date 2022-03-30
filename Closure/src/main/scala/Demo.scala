object Demo {
  /* A closure is a function which uses one or more variables declared
  outside the function
   */
  var number = 10   // called pre-variable
  val add = (x: Int) => x + 10  // without closure

  val add2 = (x: Int) => x + number  // with closure

  def main(args: Array[String]): Unit ={
    println(add(10))
    println(add2(10))

    // changing the value of variable number will also affect the result of the funcs where it is used
    number = 20
    println(add2(10))
  }
}
