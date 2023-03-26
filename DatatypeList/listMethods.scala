package DatatypeList

object listMethods {
  val myList: List[Int] = List()
  val listNum = List(1, 2, 3, 4, 5)
  val listStr: List[String] = List("John", "Robin", "Richard")

  def main(args : Array[String]) : Unit = {
    println(listStr.head)       // first element
    println(listNum.tail)       // list without the first element
    println(myList.isEmpty)     // check empty
    println(listNum.reverse)    // reverse the List
//    println(myList.fill(10)(1))   // fill with second parameter for first paremeter
    println(listStr.max)        // print the max value
    println(listStr.length)
  }
}
