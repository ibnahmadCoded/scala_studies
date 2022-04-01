object Demo {
  // options return None or Sum
  val lst = List(1, 2, 3)
  val map = Map(1 -> "Tom", 2 -> "Max")

  def main(args: Array[String]): Unit ={
    println(lst.find(_ > 2))
    println(lst.find(_ == 2))
    println(lst.find(_ > 5))
    println(map.get(3))
    println(map.get(2))

    //getting the values in the option result (use get)
    println(lst.find(_ > 1).get)
    println(map.get(2).get)

    // to avoid throwing an exception if the value does not exist, we can return sth else
    println(map.get(5).getOrElse("Key does not exist"))

    // we can also defne an option
    val opt: Option[Int] = None
    println(opt.isEmpty)
  }
}
