package PrevExam.quiz2022_sec01

object Question1 {
  def partition(l: List[Int], f:Int => Boolean) : List[List[Int]] = {
    def partitionHelper(l:List[Int], l1: List[Int], l2: List[Int]) : List[List[Int]] = {
      if (l.isEmpty) return List(l1,l2)
      if (f(l.head)) partitionHelper(l.tail,l1 ++ List(l.head), l2)
      else partitionHelper(l.tail, l1, l2 ++ List(l.head))

    }
    if (l.isEmpty) List()
    else partitionHelper(l,List(),List())

  }

  def main(args: Array[String]) : Unit = {
    val l = List(1,2,3,4,5)
    println(partition(l,x => x%2 == 0))
  }
}
