package higherOrderFunction

object higherOrder {
  // Using function as an arguement
  def calculate(x: Double, y: Double, myF: (Double,Double) => Double) : Double = {
    myF(x,y)
  }

  def mul(x: Double, y: Double) : Double = x * y

  def main(args : Array[String]) = {
    println(calculate(3,5, (a,b) => a+b))
    println(calculate(3,5,mul))
  }
}
