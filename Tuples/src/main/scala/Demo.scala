object Demo {
  val myTuple = (1, 2, "Me", true, "yes", false)
  val anotherTuple = new Tuple2(1, "Me")
  val x = (1 -> true) //only valid for 2 elements

  def main(args: Array[String]): Unit ={
    println(myTuple)
    println(anotherTuple)
    println(x)

    println(myTuple._6)
    myTuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "Tom")

    val myTuple3 = new Tuple3(1, "hello", (1, true, "yes"))
    println(myTuple3._3._2)
  }
}
