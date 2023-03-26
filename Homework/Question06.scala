package Homework

object Question06 {

  def square(x: Int) : Int = x*x
  def myMap(f:Int=>Int)(list:List[Int]):List[Int] = {
    if (list.isEmpty) List()
    else f(list.head) :: myMap(f)(list.tail)
  }

  def main(args : Array[String]) : Unit = {
    var myList = List(1,2,3,4)
    println(myMap(square)(myList))
  }
}
