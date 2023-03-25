package package01

object loopWithCondition {
  def main(args : Array[String]) : Unit = {

    for (x <- 0 until 5; if x%2 == 0){
      println(x)
    }

    println("--------------")

    var myList = List(1,3,5,7)
    for (m <- myList; if m > 3){
      println(m)
    }

  }
}
