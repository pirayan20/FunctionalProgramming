package revisit

object fiboSeq {
  def fibonacci(n: Int): List[Int] = {
    def go(i: Int, prev: Int, curr: Int, result: List[Int]): List[Int] = {
      if (i >= n) result
      else go(i + 1, curr, prev + curr, result ++ List(curr))
    }
    go(1, 0, 1, List(0))
  }

  def main(args : Array[String]) : Unit = {
    println(fibonacci(10))
  }
}
