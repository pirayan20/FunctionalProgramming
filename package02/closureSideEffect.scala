package package02

object closureSideEffect {
  var n = 5
  var add = (x: Int) => {
    n = x+n
    n
  }   // closure with n coming from outside

  def main(args : Array[String]) : Unit = {
    println(add(2))       // closure with add coming from outside
    n = 100
    println(add(2))
    println(add(2))
  }
}

