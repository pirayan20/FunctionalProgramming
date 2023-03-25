package higherOrderFunction

object functionChain {
  def calculate(x: Double, y: Double, z: Double, myF: (Double,Double) => Double) : Double = {
    // using myF() as a chaining function in calculate()
    myF(myF(x,y),z)
  }

  def mul(x: Double, y: Double) : Double = x * y

  def main(args : Array[String]) : Unit = {
    println(calculate(3,5,7,(a,b) => a + b))
    println(calculate(3,5,7, _+_))       // operand +
    println(calculate(3,5,7, mul))
    println(calculate(3,5,7,(a,b) => a min b))
    println(calculate(3,5,7, _ min _))   // operand "min"
  }
}
