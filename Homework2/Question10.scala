package Homework2

object Question10 {
  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]) : Int = {
    helper(f1,f2,list,0,0)
  }

  def helper(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], cnt: Int, acc: Int) : Int = {
    if (list.isEmpty) return acc
    if (cnt % 2 == 0) helper(f1,f2,list.tail, cnt+1, f1(list.head,list.tail.head))
    else helper(f1,f2, list.tail, cnt + 1, f2(list.head,list.tail.head))
  }
}
