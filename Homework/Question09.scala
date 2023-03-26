package Homework

object Question09 {

  def turingStep(f: Char => Char, tape: List[Char], n: Int) : List[Char] = {
    turingStep(f,tape,n,1)
  }

  def turingStep(f: Char => Char, tape: List[Char], n: Int, acc: Int) : List[Char] = {
    if (tape.isEmpty) return List()
    else if (acc <= n) f(tape.head) :: turingStep(f, tape.tail, n,acc+1)
    else tape
  }

  def main(args: Array[String]) : Unit = {
    var tape = List('C','H','A','R')
    println(turingStep(x => x.toLower,tape,2))
    println(turingStep(x => x.toLower,tape,3))
    println(turingStep(x => x.toLower,tape,0))
    println(turingStep(x => x.toLower,tape,5))
  }

}
