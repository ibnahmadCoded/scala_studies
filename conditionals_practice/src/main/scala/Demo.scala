object Demo {
  def main(args: Array[String]): Unit ={
    val x = 20
    val y = 30
    var res = ""

    if (x == 20 && y == 30){
      res = f"x is equal to ${x}%f and y is equal to ${y}%d"
    } else {
      res = "x is not equal to 20"
    }

    println(res)

    val res2 = if (x == 20) f"x is equal to ${x}%f" else "x is not equal to 20"
    println(res2)

    println(if (x == 20) f"x is equal to ${x}%f" else "x is not equal to 20")
  }
}
