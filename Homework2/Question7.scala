package Homework2

object Question7 {

  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    helper(f)(list)(List())
  }

  def helper(f: Int => Boolean)(list:List[Int])(acc: List[Int]) : List[Int] = {
    if (list.isEmpty) return acc
    if (f(list.head)) helper(f)(list.tail)(acc ++ List(list.head))
    else helper(f)(list.tail)(acc)
  }

  def main(args: Array[String]) : Unit = {
    val isEven = (x: Int) => {
      x % 2 == 0
    }
    val x = List(1,2,3,4,5)
    println(myFilter(isEven)(x))
  }
}
