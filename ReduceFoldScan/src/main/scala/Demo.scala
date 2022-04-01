object Demo {
  val lst = List(1,2,3,4,5,6,7,8,9,10)
  val lst2 = List("A", "B", "C")

  def main(args: Array[String]): Unit ={
    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft((x,y) => {println(x + " , "+ y); x+y}))

    println(lst.reduceLeft(_ - _))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x,y) => {println(x + " , "+ y); x-y}))

    println()
    println(lst.foldLeft(0)(_ + _))
    println(lst.foldLeft(10)(_ + _))
    println(lst2.foldLeft("Z")(_ + _))
    println(lst2.foldRight("Z")(_ + _))

    println()
    println(lst.scanLeft(10)(_ + _))
    println(lst2.scanLeft("Z")(_ + _))

  }
}
