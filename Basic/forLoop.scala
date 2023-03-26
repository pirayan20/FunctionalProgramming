package Basic

object forLoop {
  def main(args : Array[String]) : Unit = {
    for (x <- 0 to 3){
      println(x)
    }

    // until won't include the stop value
    for (x <-0 until 4){
      println(x)
    }

    // nested loop
    for (x <- 0 until 5 ; i <- 0 to 4){
      println(s"$x , $i")
    }
  }
}
