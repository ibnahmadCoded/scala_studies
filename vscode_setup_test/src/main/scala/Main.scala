@main def hello: Unit =
  println("Hello world!")
  println(msg)

def msg = "I was compiled by Scala 3. :)"

object Main:
  val name = Option("Bob")
  name.get
  name.getOrElse("")
  val surname = ""
  surname + name.get
