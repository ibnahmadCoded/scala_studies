object Demo {
  def main(args: Array[String]): Unit ={

    for (i <- 1.to(5)){
      println("i using to " + i)
    }

    for (i <- 1 to 5){
      println("i using to " + i)
    }

    for (i <- 1.until(6)){
      println("i using to " + i)
    }

    for (i <- 1 until 6){
      println("i using to " + i)
    }

    for (i <- 1 until 6; j <- 1 to 3){
      println("i using to " + i + " j using to " + j)
    }

    val lst = List(1,2,3,4,5,6)
    for (i <- lst){
      println("list element is "+ i)
    }

    for (i <- lst; if i < 3){
      println("filtering list "+ i)
    }

    val result = for {i <- lst; if i < 3} yield {
      i * i
    }
    println("result equals "+result)

    val res = for {
      i <- lst
      if i < 3
    } yield {
      i * i
    }
    println(res)
  }
}
