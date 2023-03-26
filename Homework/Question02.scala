package Homework

object Question02 {
  def insertInOrder(x:Int, list:List[Int]) : List[Int] = {
    if (list.isEmpty) return List(x)
    if (list.head > x) x :: list
    else list.head :: insertInOrder(x,list.tail)
  }

  /*   with tail-recursive
  def insertInOrder(x: Int, list: List[Int]): List[Int] = {

    def func(x: Int, l: List[Int], newl: List[Int], b: Boolean): List[Int] = {
      if (l.isEmpty) {
        if (b) {
          return newl ++ List(x);
        } else {
          return newl;
        }
      } else if (x < l.head && b) {
        return func(x, l.tail, newl ++ List(x, l.head), !b)
      } else {
        return func(x, l.tail, newl ++ List(l.head), b);
      }
    }

    if (list.isEmpty) {
      return List(x);
    } else {
      return func(x, list, List(), true);
    }
  }
  */

  def main(args : Array[String]) : Unit = {
    var myList = List(1,3,5,6,8,9)
    println(insertInOrder(20,myList))
  }
}
