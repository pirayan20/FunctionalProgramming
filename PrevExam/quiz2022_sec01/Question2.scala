package PrevExam.quiz2022_sec01

object Question2 {
  def compliment(f:Int => Int) : Int => Int = {
    (x: Int) => -1*f(x)
  }

  def main(args : Array[String]) : Unit = {
    println(compliment(x => x*x)(-5))
  }
}
