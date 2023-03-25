package package01

object loopInList {
  def main(args : Array[String]) : Unit = {
    var myList = List(1,3,5,7)
    for (m <- myList){
      print(m + " ")
    }
  }
}
