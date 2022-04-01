object Demo {
  // Lists are immutable in scala. In Scala, it is a linked list
  val myList: List[Int] = List(1,2,3,4,5)
  val myList2: List[String] = List("Max", "tom", "Alex")

  def main (args: Array[String]): Unit ={
    0 :: myList
    println(myList)
    println(0 :: myList)
    println(myList)
    println(myList2)
    println(1 :: 2 :: 3 :: Nil) // print any list by creating it with Nil
    println(myList.head)
    println(myList.tail)  // tail is everything left after removing the head (i.e. the first value)
    println(myList2.isEmpty)  // is list empty
    println(myList2.reverse)
    println(myList2)
    val newList = myList :: 10 :: 11 :: 50 :: Nil //appending to list
    println(newList)
    val newList1 = myList //appending to list
    println(newList1)
    val newList2 = 0 :: myList
    println(newList2)
    val x = myList2.reverse
    println(x)
    myList.foreach( println )

    // add all elements (indicated by _) of the list
    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)

    for (e <- myList2){
      println(e)
    }
  }
}
