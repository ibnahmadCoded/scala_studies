object TestObject {

  def addInt(a:Int, b:Int): Int = {

    var sum:Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]): Unit = {
    print("Sum of values "+ addInt(5,7))
  }
}
