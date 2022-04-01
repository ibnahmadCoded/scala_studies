class strictEval {
  val e = {
    println("strict")
    9
  }
}

class lazyEval {
  lazy val l = {
    println("lazy")
    9
  }
}
object Demo {

  def main(args: Array[String]): Unit ={
    val x = new strictEval
    val y = new lazyEval

    println(x.e)
    println(y.l)
  }
}
