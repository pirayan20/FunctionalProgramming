package Homework

object Question02 {
  def insertInOrder(x:Int, list:List[Int]) : List[Int] = {
    if (list.isEmpty) return List(x)
    if (list.head > x) x :: list
    else list.head :: insertInOrder(x,list.tail)
  }

  def main(args : Array[String]) : Unit = {
    var myList = List(1,3,5,6,8,9)
    println(insertInOrder(20,myList))
  }
}
