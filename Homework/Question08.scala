package Homework

object Question08 {

  def sumList(l1: List[Int], l2: List[Int]): List[Int] = {
    if (l1.isEmpty && l2.isEmpty) return List();
    if (l1.isEmpty) return l2;
    if (l2.isEmpty) return l1;
    else {
      (l1.head + l2.head) :: sumList(l1.tail, l2.tail)
    }
  }

  def process(l: List[Int], lists:List[List[Int]]):List[Int] = {
    if (lists.isEmpty) return l
    if (lists.head.isEmpty) {
      if (lists.tail.isEmpty) return List()
      else process(l, lists.tail);
    }
    process(sumList(l, lists.head), lists.tail);
  }

  def sumAll(lists: List[List[Int]]): List[Int] = {
    if (lists.isEmpty) return List();
    process(lists.head, lists.tail)
  }

  def main(args: Array[String]): Unit = {
    println(sumAll(List()));
    println(sumAll(List(List(),List())))
    println(sumAll(List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))))
    println(sumAll(List(List(3,4),List(1,2,3,4,5,6),List(1,2,3,4))))
    println(sumAll(List(List(1,2,3,4,5,6),List(1,2,3,4),List(1,2),List(0,0,0,0,0,0,0,0,9))))
  }
}
