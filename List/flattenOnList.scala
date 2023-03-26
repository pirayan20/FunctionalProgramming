package List

object flattenOnList {
  val myList: List[Int] = List()
  val listNum = List(1, 2, 3, 4, 5)
  val listNum2 = List(10, 20, 30, 40, 50)
  val listStr: List[String] = List("John", " Robin", "Richard")

  def addCurry(x:Int) : Int => Int = {
    (y : Int) => x+y
  }

  def main(args : Array[String]) : Unit = {
    println(List(listNum,listNum2))
    // to flatten the list => same as using ++ with list multiple times
    println(List(listNum,listNum2).flatten)
  }
}
