object Demo {
  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 803 -> "Julie")
  val myMap3: Map[Int, String] = Map(805 -> "Max", 802 -> "Tom", 804 -> "Julie")
  val myMap2: Map[Int, Map[String, String]] = Map(801 -> Map("Color" -> "Yellow"), 802 -> Map("Color" -> "Red"))
  def main(args: Array[String]): Unit ={
    println(myMap)
    println(myMap2)

    // print particular element with key
    println(myMap(803))

    println(myMap.keys)
    println(myMap2.keys)
    println(myMap.values)
    println(myMap2.values)
    println(myMap.isEmpty)

    myMap.keys.foreach {
      key =>
        println("Key " + key)
        println("Value " + myMap(key))
    }

    println(myMap.contains(801))
    println(myMap.contains(807))

    println(myMap ++ myMap3)

    println(myMap.size)
  }
}
