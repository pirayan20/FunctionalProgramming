package Basic

object helloWorld {
  def main(args : Array[String]): Unit = {
    var name = "Tanjiro"
    var age = 15
    // s string interpolation
    println(s"$name is $age years old.")
    // f string interpolation
    println(f"$name%s is $age%d years old")
    // Raw string interpolation
    println(raw"Hello\nWorld")
  }
}
