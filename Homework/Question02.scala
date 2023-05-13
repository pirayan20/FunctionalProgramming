package Homework

object Question02 {
//  def insertInOrder(x:Int, list:List[Int]) : List[Int] = {
//    if (list.isEmpty) return List(x)
//    if (list.head > x) x :: list
//    else list.head :: insertInOrder(x,list.tail)
//  }

  //with tail-recursive
  def insertInOrder(x: Int, list: List[Int]) : List[Int] = {
    @annotation.tailrec
    def helper(x: Int, list: List[Int], acc: List[Int]) : List[Int] = {
      if (list.isEmpty) return acc ++ List(x)
      if (list.head > x) acc ++ List(x) ++ list
      else helper(x, list.tail, acc ++ List(list.head))
    }
    helper(x,list,Nil)
  }

  def main(args : Array[String]) : Unit = {
    var myList = List(1,3,5,6,8,9)
    println(insertInOrder(20,myList))
  }
}
