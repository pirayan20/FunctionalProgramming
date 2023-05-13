package Homework2

object Question6 {

  def square(x: Int) : Int = x * x
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    helper(f)(list)(List())
  }

  def helper(f: Int => Int)(list: List[Int])(acc: List[Int]): List[Int] = {
    if (list.isEmpty) acc
    else helper(f)(list.tail)(acc ++ List(f(list.head)))
  }

  def main(args: Array[String]) : Unit = {
    val x = List(1,2,3,4,5)
    println(myMap(square)(x))

  }
}
