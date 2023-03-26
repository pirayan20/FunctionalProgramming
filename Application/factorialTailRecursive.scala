package Application

object factorialTailRecursive {
  // non tail-recursive
  def factorial(x: Int) : Int = {
    if (x == 0) return 1
    x * factorial(x-1)
  }

  // tail-recursive
  def factorialTail(x: Int, acc: Int): Int = {
    if (x == 0) return acc
    factorialTail(x-1, x*acc)
  }

  def main(args: Array[String]) : Unit = {
    println(factorial(4))
    println(factorialTail(4,1))
  }
}