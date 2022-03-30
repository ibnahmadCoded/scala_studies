object Demo {

  def math(x: Double, y: Double, f:(Double, Double)=>Double): Double = f(x,y)

  def math2(x: Double, y: Double, z: Double, f:(Double, Double)=>Double): Double = f(f(x,y), z)

  def main(args: Array[String]): Unit ={
    val result = math(50, 20, (x,y)=>x+y)
    val result2 = math(50, 20, (x,y)=>x*y)
    val result3 = math(50, 20, (x,y)=>x min y)
    val result4 = math2(50, 20, 10, (x,y)=>x + y)
    val result5 = math2(50, 20, 10, _+_) //another version result4
    val result35 = math(50, 20, _ max _)
    println(result)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    println(result35)
  }
}
