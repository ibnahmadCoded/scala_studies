package Inheritance

class Rectangle(var width: Double, height: Double) extends Polygon {
  override def area : Double = width * height
}
