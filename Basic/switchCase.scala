package Basic

object switchCase {
  def main(args : Array[String]) : Unit = {
    var x =45
    x match {
      // Scala is not fall-through -> does not need break statement
      case 10 => println("x is 10")
      case 20 => println("x is 20")
      case 25 => {
        println("x is 25")
        println("And that's it")
      }
      case 30 => println("x is 30")
      case _ =>   // defualt
    }
  }

}
