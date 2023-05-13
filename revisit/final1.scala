package revisit

object final1 {
  /*
  def swapPair(l: List[Int]) : List[Int] = {
    def process(l: List[Int], acc:List[Int], tmp:List[Int], cnt: Int) : List[Int] = {
      if (l.isEmpty){
        if (tmp.nonEmpty) process(l, acc ++ List(tmp.head), tmp.tail, cnt + 1)
        else acc
      }
      if (cnt % 2 == 1 && cnt != 1) process(l.tail, acc++tmp, List(l.head), cnt + 1)
      else process(l.tail, acc, l.head :: tmp, cnt + 1)
    }
    process(l, List(), List(),1)
  }
   */

  def swapPair(list: List[Any]): List[Any] = {
    def go(l: List[Any], acc: List[Any]): List[Any] = {
      if (l.isEmpty) acc
      else if (l.tail.isEmpty) acc ++ List(l.head)
      else {
        val pair = List(l.tail.head, l.head)
        go(l.tail.tail, acc ++ pair)
      }
    }

    go(list, Nil)
  }

  def main(args: Array[String]): Unit = {
    val list1 = List()
    val list2 = List(22)
    val list3 = List(1, 2, 3)
    val list4 = List(1, 2, 3, 4)
    val list5 = List(1, 2, 3, 4, 5)
    val list6 = List(1, 2, 3, 4, 5, 6)

    println(swapPair(list1) == List())
    println(swapPair(list2) == List(22))
    println(swapPair(list3) == List(2, 1, 3))
    println(swapPair(list4) == List(2, 1, 4, 3))
    println(swapPair(list5) == List(2, 1, 4, 3, 5))
    println(swapPair(list6) == List(2, 1, 4, 3, 6, 5))

  }

}
