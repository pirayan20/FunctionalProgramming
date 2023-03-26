package DatatypeList

object mapOnList {
  val myList: List[Int] = List()
  val listNum = List(1,2,3,4,5)
  val listStr : List[String] = List("John"," Robin", "Richard")

  def addCurry(x:Int): Int => Int = {
    (y: Int) => x + y
  }

  def main(args : Array[String]) : Unit = {
    println(listNum.map(_ * 2))
    println(listNum.map(x => x*2))
    println(listNum.map(addCurry(100)(_)))
  }
}
