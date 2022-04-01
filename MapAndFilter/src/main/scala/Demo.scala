object Demo {
  val lst = List(1,2,3,4,5,6,7,10)
  val myMap = Map(1 -> "Ali", 2 -> "Alege", 3 -> "ETC")

  def main(args: Array[String]): Unit ={
    println(lst.map(x => x * 2))
    println(lst.map(x => "hi" * 2))
    println(myMap.map(x => "hi " + x))
    println(myMap.map(x => "hi " + x._2))
    println(myMap.mapValues(x => "hi " + x)) //deprecated?
    println("aliyu".map(x => x.toUpper))
    println("aliyu".map(_.toUpper))

    println(List(List(1,2,3), List(3,4,5)))
    println(List(List(1,2,3), List(3,4,5)).flatten)
    println(lst.flatMap(x => List(x, x+1)))

    println(lst.filter(x => x%2==0)) //get all even values. filter usually used with predicates (predicates are funcs)
  }
}
