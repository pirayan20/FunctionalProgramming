package package01

object conditional {
  def main(args : Array[String]) : Unit = {
    var age = 15
    var x = 3
    var message = ""
    if (age == 15){
      println("YES")
    } else if (age == "NO"){
      println("NO")
    } else {
      println("BRUH")
    }

    var result = if (age != 15) "age is not 15" else "age is 15"
    println(result)
  }


}
