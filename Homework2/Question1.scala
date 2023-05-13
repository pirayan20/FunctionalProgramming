package Homework2

object Question1 {
  def insertATPosition(x: Any, pos: Int, l: List[Any]) : List[Any] = {
    insertATPosition(x,pos,l,List(),0)
  }

  def insertATPosition(x: Any, pos: Int, l: List[Any], acc: List[Any], i: Int) : List[Any] = {
    if (i == pos) return acc ++ List(x) ++ l
    insertATPosition(x, pos, l.tail, acc++List(l.head), i+1)
  }

  def main(args: Array[String]) : Unit = {
    val x = List(1,3,5,7,9)
    println(insertATPosition(4,5,x))
  }
}
