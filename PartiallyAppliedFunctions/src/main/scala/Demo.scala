import java.util.Date

object Demo {

  def log(date: Date, message: String): Unit = {
    println(date + "      " + message)
  }

  val date = new Date
  val newlog = log(date, _:String)

  def main(args: Array[String]): Unit ={
    val sum = (a:Int, b:Int, c:Int) => a + b + c // an example of a fully applied function stored in variable sum

    val f = sum(10, 20, _ : Int)  // using function sum to create a partially applied function f

    println(sum(10,20,30))
    println(f(30)) // Note: the third argument can be supplied instead of hard-coded. it is considered as a wildcard
    println(newlog("This is a new log message"))
  }
}