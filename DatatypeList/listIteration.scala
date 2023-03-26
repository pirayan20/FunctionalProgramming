package DatatypeList

object listIteration {
  var listNum = List(1,2,3,4,5)
  var listStr = List("Richard", "John", "Sarah")

  // foreach will take the function as a parameter
  // to do that function with each element in the list
  def main(args : Array[String]) : Unit = {
    println(listNum.foreach(println))

    for (name <- listStr) {
      println(name)
    }

    var sum = 0
    listNum.foreach(sum += _)
    println(sum)

    println(listNum(4))
  }
}
