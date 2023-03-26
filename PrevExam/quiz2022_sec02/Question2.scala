package PrevExam.quiz2022_sec02

object Question2 {

  def member(x: Any, l: List[Any]) : Boolean = {
    if (l.isEmpty) return false
    if (x == l.head) true
    else member(x,l.tail)
  }

  def moreThanHalf(l1: List[Any], l2: List[Any]) : Boolean = {
    def helper(l1: List[Any], l2: List[Any], acc: Int) : Int = {
      if (l1.isEmpty) return acc
      if (member(l1.head,l2)) helper(l1.tail,l2,acc+1)
      else helper(l1.tail,l2,acc)
    }
    println(helper(l1,l2,0))
    if (helper(l1,l2,0) >= (l1.length/2)) true
    else false
  }

  def main(args: Array[String]) : Unit = {
    val l1 = List(1,4,3,2,7,8)
    val l2 = List(2,9,7,1,6,10)
    println(moreThanHalf(l1,l2))
  }
}
