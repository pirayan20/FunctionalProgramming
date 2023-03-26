package functionAndCurrying

object Closure {
  var n = 5
  val add = (x: Int) => x+n         // closure with n coming from outside

  def main(args : Array[String]) : Unit = {
    println(add(2))                 // closure with add coming from outside
    n = 100
//    var n = 100                   // uncomment this to see that it will use N
                                    // that was declared in the static scope
    println(add(2))
  }
}
