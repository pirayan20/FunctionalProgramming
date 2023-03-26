package PrevExam.Final2022

object Question1 {
  /*
  def swapPair(l: List[Int]) : List[Int] = {
    if (l.isEmpty) return List()
    if (l.length <= 1)  l
    else l.tail.head :: l.head :: swapPair(l.tail.tail)
  }
   */

  def swapAndReturnAsList(l: List[Int], acc: List[Int]): List[Int] = {
    if (l.isEmpty) acc;
    else swapAndReturnAsList(l.tail, l.head :: acc);
  }

  def process(l: List[Int], cnt: Int, acc: List[Int], tmp: List[Int], len: Int): List[Int] = {
    if (l.isEmpty) acc ++ tmp;
    else {
      if (cnt % 2 == 1) {
        process(l.tail, cnt + 1, acc, tmp ++ List(l.head), len)
      }
      else process(l.tail, cnt + 1, acc ++ swapAndReturnAsList(
        tmp ++ List(l.head), List()), List(), len)
    }
  }

  def swapPair(l: List[Int]): List[Int] = {
    process(l, 1, List(), List(), l.length);
  }

  def main(args: Array[String]) : Unit = {
    val myList = List(1,2,3)
    println(swapPair(myList))
  }
}
