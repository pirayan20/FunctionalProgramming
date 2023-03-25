package package01

object whileLoop {
  def main(args : Array[String]) : Unit = {
    var x = 0

    while (x < 10) {
      x += 1    // x++ and ++x is not allowed in Scala
      println(x)
    }

    // do-while
    do {
      x += 1
      println(x)
    } while (x < 0)

  }
}
