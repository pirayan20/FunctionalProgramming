package package02

object curryingExample {

  def square(x: Int) : Int = x*x

  def sum(f: Int => Int) : (Int,Int) => Int = {
    def sumF(a: Int, b: Int) :  Int = {
      if (a > b) 0
      else f(a) + sumF(a+1,b)
    }
    sumF
  }

  /*
  short-handed for sum
  def sum(f: Int => Int)(a: Int, b:Int) : Int = {
    if (a>b) 0
    else f(a) + sum(f)(a+1,b)
  }
   */

  def main(args: Array[String]) : Unit = {
    println(sum(square)(2,4))
  }
}
