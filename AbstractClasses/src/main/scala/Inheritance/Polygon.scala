package Inheritance

abstract class Polygon {
  def area: Double
}

object Polygon{
  def main(args: Array[String]): Unit ={
    var rect = new Rectangle(20, 10)

    var tri = new Triangle(15, 25)
    printArea(rect)
    println()
    printArea(tri)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}
