object Demo {

  object Math {
    def Add(x: Int, y: Int): Int ={
      return x+y
    }

    def Square(x:Int) = x*x

    def +(x: Int, y: Int): Int ={
      return x+y
    }

  }

  def Add(x: Int = 45, y: Int = 15): Int ={
    return x+y
  }

  def Sub(x: Int, y: Int): Int ={
    x-y
  }

  def Mul(x: Int, y: Int): Int = return x*y

  def Mul2(x: Int, y: Int): Int = x*y

  def Div(x: Int, y: Int) = x/y

  def print(x:Int, y:Int):Unit = {
    println(x+y)
  }

  def main(args: Array[String]): Unit ={
    println(Add())
    println(Sub(45,15))
    println(Mul(45,15))
    println(Mul2(45,15))
    println(Div(45,15))
    println(Math.Add(45,15))
    println(Math Square 3) // when a function has only 1 argument
    print(3,5)
    println(Math.+(5,3))

    var add = (x: Int, y:Int) => x+y // anonymus function
    println(add(300,500))
  }
}
