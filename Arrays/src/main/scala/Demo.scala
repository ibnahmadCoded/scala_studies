import Array._

object Demo {
  val array1: Array[Int] = new Array[Int](4)
  val array2 = new Array[Int](5)
  val array3 = Array(1,2,3,4,5)
  val array4= Array("ab1","cd2",3,4,5)
  def main(args: Array[String]): Unit ={
    array1(0) = 5
    array1(1) = 15
    array1(2) = 25
    array1(3) = 35
    println(array1)
    println(array1(0))
    for (x <- array1){
      println(x)
    }
    for (i <- array1.indices){
      println(array1(i))
    }
    for (i <- array2.indices){
      println(array2(i))
    }

    for (i <- array3.indices){
      println(array3(i))
    }

    for (i <- array4.indices){
      println(array4(i))
    }

    concat(array1, array2)
  }
}
