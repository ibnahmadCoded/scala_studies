object Sets {
  // a set is a collection of different elements of same data types, i.e. no duplicates
  val myList: List[Int] = List(1,2,3,4,5,6,7, 7) // sample list (has duplicates)
  val mySet: Set[Int] = Set(1,2,3,4,5,6,7, 7) //immutable set
  val mySet3: Set[Int] = Set(11,2,31,4,51,61,17, 7) //immutable set
  val mySet2: Set[String] = Set("Max", "Alex", "Ali", "Ali")  //immutable set
  def main(args: Array[String]): Unit ={
    // even though values are duplicated in the declarations, values will be be unique in the set
    println(mySet)
    println(mySet2)
    val mutableSet = scala.collection.mutable.Set(1,2,3,4,5)
    val anotherMutableSet: scala.collection.mutable.Set[String] = scala.collection.mutable.Set("Alex", "Ali")
    println(mutableSet)
    println(anotherMutableSet)
    println()
    println(mutableSet + 10)
    println(mutableSet) //mutableSet changes ???
    println()
    println(mySet + 10)
    println(mySet) //mySet does not change
    println()
    // find if an element exists in a set
    println(mySet(7))
    println(mySet(77))
    println()
    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)

    // concatenate 2 sets
    println(mySet ++ mutableSet)
    println(mySet.++(mutableSet))

    // intersection of 2 sets
    println(mySet.&(mySet3))
    println(mySet.intersect(mySet3))

    mySet2.foreach(println)

    for (n <- mySet2){
      println(n)
    }
  }
}
