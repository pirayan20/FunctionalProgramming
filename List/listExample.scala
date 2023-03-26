package List

object listExample {
  // List is immutable
  val myList: List[Int] = List()
  val listNum = List(1,2,3,4,5)
  val listStr: List[String] = List("John","Robin","Richard")

  // define a list with "Cons"
  // => "Will" will be the first element int he listStr2 with listStr push_back
  val listStr2 = "Will" :: listStr
  // "Nil" is an empty List
  val listNum2 = 9 :: 6 :: 17 :: Nil

  def main(args : Array[String]) = {
    println(myList)
    println(listNum)
    println(listStr(1))

    // appending List to a List
    println(listNum ++ listNum2)
  }

}
