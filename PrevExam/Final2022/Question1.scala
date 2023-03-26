package PrevExam.Final2022

object Question1 {
  def swapPair(l: List[Int]) : List[Int] = {
    if (l.isEmpty) return List()
    if (l.length <= 1)  l
    else l.tail.head :: l.head :: swapPair(l.tail.tail)
  }

  def main(args: Array[String]) : Unit = {
    val myList = List(1,2,3)
    println(swapPair(myList))
  }
}
