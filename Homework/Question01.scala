package Homework

object Question01 {
  def insertLast(x:Any, l:List[Any]) : List[Any] = l ++ List(x)

  def main(args : Array[String]) : Unit = {
    var l = List(1,2,3,4,5)
    println(insertLast(10,l))
  }
}
