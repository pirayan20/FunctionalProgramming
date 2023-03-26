package Application

object pascalTriangle {
  def pascal(c: Int, r: Int) : Int = {
    if (c == 1 | c == r) 1
    else {
      pascal(c-1,r-1) + pascal(c,r-1)
    }
  }

  def main(args : Array[String]) : Unit = {
    println(pascal(4,7))
  }
}
