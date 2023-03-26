package Basic

object functionObject {
  // nested object to use in the main
  object Math{
    def addM(x:Int ,y: Int) : Int = x+y
    def squareM(x: Int) : Int = x*x
  }

  def main(args : Array[String]) : Unit = {
    println(area(2,3))
    println(areaScale(4,5))
    println(Math squareM 4 )  // one argument-function can be called like this
  }

  // can be initialized with default value
  def area(width: Int = 1, height: Int =1) : Int = {
    width * height
  }

  // use method from Math.object
  def areaScale(w: Int, h: Int) : Int = {
    val w2 = w+1     // cannot mutate the parameter => w+=1
    val h2 = Math.addM(h,1)
    w2*h2
  }
}
