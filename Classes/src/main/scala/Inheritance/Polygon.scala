package Inheritance

class Polygon {
  def area: Double = 0.0
}

object Polygon{
  def main(args: Array[String]): Unit ={
    var poly = new Polygon
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
