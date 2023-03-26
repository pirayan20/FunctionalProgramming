package Homework

object Question4 {
  def mergesort(list: List[Int]):List[Int] = {

    def merge(l: List[Int], r: List[Int]): List[Int] = {
      (l,r) match {
        case (Nil,r) => r
        case (l,Nil) => l
        case (leftHead :: leftTail, rightHead :: rightTail) =>
          if (leftHead < rightHead) leftHead :: merge(leftTail, r)
          else rightHead :: merge(l, rightTail)
      }
    }

    val n = list.length / 2
    if (n == 0) list
    else {
      val (left, right) = list.splitAt(n)
      merge(mergesort(left), mergesort(right))
    }
  }

  def main(args: Array[String]) : Unit = {
    var myList = List(3,4,1,2)
    println(mergesort(myList))
  }
}
