package Homework

object Question04 {

  def mergesort(list: List[Int]): List[Int] = {
    if (list.length <= 1) list
    else {
      val middle = list.length / 2
      val (left, right) = (list.take(middle), list.drop(middle))
      merge(mergesort(left), mergesort(right))
    }
  }

  def merge(left: List[Int], right: List[Int]): List[Int] = {
    if (left.isEmpty) right
    else if (right.isEmpty) left
    else if (left.head < right.head) left.head :: merge(left.tail, right)
    else right.head :: merge(left, right.tail)
  }

  def main(args: Array[String]) : Unit = {
    var myList = List(3,4,1,2)
    println(mergesort(myList))
  }
}
