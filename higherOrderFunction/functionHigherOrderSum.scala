package higherOrderFunction

object functionHigherOrderSum {
  // non tail-recursive
  def sum(f: Int => Int, a: Int, b: Int) : Int = {
    if (a > b) 0
    else f(a) + sum(f,a+1,b)
  }

  // tail-recursive
  def sumTail(f: Int => Int, a:Int, b:Int) : Int = {
    def sumAcc(a:Int, acc:Int) : Int = {
      if (a > b) acc
      else sumAcc(a+1,acc+f(a))
    }
    sumAcc(a,0)
  }

  def id(a: Int) : Int = a
  def square(a: Int) = a*a
  def factorial(x: Int, acc: Int) : Int = {
    if (x == 0) return acc
    factorial(x-1,x*acc)
  }
  def fac(a: Int) : Int = factorial(a,1)

  def main(args : Array[String]) : Unit = {
    println(sum(id,2,4))
    println(sum(square,2,4))
    println(sum(fac,2,4))
  }
}
