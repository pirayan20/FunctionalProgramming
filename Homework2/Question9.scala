package Homework2

object Question9 {
  def turingStep(f:Char => Char, tape: List[Char], n: Int) : List[Char] = {
    helper(f,tape,n,0,Nil)
  }

  def helper(f: Char => Char, tape: List[Char], n: Int, cnt: Int, acc: List[Char]) : List[Char] = {
    if (tape.isEmpty) return acc
    if (cnt >= n) return acc ++ tape
    helper(f,tape.tail,n,cnt + 1, acc ++ List(f(tape.head)))
  }

  def main(args: Array[String]): Unit = {
    var tape = List('C', 'H', 'A', 'R')
    println(turingStep(x => x.toLower, tape, 2))
    println(turingStep(x => x.toLower, tape, 3))
    println(turingStep(x => x.toLower, tape, 0))
    println(turingStep(x => x.toLower, tape, 5))
  }
}
