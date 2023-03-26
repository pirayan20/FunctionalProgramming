package Homework

object Question3 {
  def member(x: Any, l: List[Any]): Boolean = {
    if (l.isEmpty) false
    if (l.head == x) true
    else member(x, l.tail)
  }

  def subList(l1:List[Any], l2: List[Any]) : Boolean = {
    if (l1.isEmpty) return true
    else if (member(l1.head,l2)) subList(l1.tail,l2)
    else false
  }

  def main(args: Array[String]) : Unit = {
    var l1 = List(7)
    var l2 = List(1,2,3,4,5)
    println(subList(l1,l2))
  }
}
