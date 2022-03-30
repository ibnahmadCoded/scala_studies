object Demo {
  def main(args: Array[String]): Unit ={
    val age = 18

    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 200 => println(age)
      case 19 => println(age)

      // def
      case  _ => println(age)
    }

    val result = age match {
      case 20 => age
      case 18 => age
      case 200 => age
      case 19 => age

      // def
      case  _ => age
    }

    println(age)

    val i = 7
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("Odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }

}
