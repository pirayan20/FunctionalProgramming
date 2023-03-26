package functionAndCurrying

import java.util.Date  //Java

object functionPartiallyAppliedApplication {
  def dateMessage(date: Date, s: String) : Unit = {
    println(date + ", " + s)
  }

  def main(args : Array[String]) : Unit = {
    var date =new Date
    var newMessage = dateMessage(date, _: String)
    for (i <- 0 to 5){
      Thread.sleep(300)           //Java
      date = new Date
      newMessage("message " + i)
    }
  }
}
