package Homework

object Question7 {

  def myFilter(f:Int=>Boolean)(list:List[Int]):List[Int] = {
    if (list.isEmpty) return List()
    if (f(list.head)) list.head :: myFilter(f)(list.tail)
    else myFilter(f)(list.tail)
  }

  def main(args: Array[String]) : Unit = {
    val myList = List(1,2,3,5,10,12)
    println(myFilter(x => x%2 == 0)(myList))
  }
}
