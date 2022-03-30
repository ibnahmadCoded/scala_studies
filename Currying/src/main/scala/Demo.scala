/* Currying is a technique for transforming a function that
* takes multiple arguments into a function that takes a single argument */
object Demo {

  def add(x: Int, y: Int) = x + y

  // transforming add to a function that takes only 1 arg using currying
  def add2(x:Int) = (y: Int) => x + y

  // curry a function in another way
  def add3(x:Int)(y:Int)(z:Int) = x + y + z

  def main(args: Array[String]): Unit ={
    println(add(20,10))

    // using curried function
    println(add2(20)(10))

    // another way of using curried function
    val curry = add2(30)
    println(curry(20))

    println(add3(20)(10)(20))

    val curry2 = add3(20)_
    println(curry2(10)(20))
  }
}
