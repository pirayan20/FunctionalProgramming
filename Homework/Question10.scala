package Homework

object Question10 {

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]) : Int = {
    if (list.isEmpty) return 0
    alternate(f1,f2,list,0)
  }

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int], acc: Int) : Int = {
    if (list.length == 1) return list.head
    if (acc % 2 == 0){
      var tmp = f1(list.head,list.tail.head)
      if (list.tail.tail.isEmpty) return tmp
      else alternate(f1, f2, tmp :: list.tail.tail, acc + 1)
    } else {
      var tmp = f2(list.head, list.tail.head)
      if (list.tail.tail.isEmpty) return tmp
      else alternate(f1, f2, tmp :: list.tail.tail, acc + 1)
    }
  }

  def main(args : Array[String]) : Unit = {
    println(alternate((x,y) => x+y, (x,y) => x-y,List()))
    println(alternate((x,y) => x+y, (x,y) => x-y,List(55)))
    println(alternate((x,y) => x+y, (x,y) => x-y,List(1,2)))
    println(alternate((x,y) => x+y, (x,y) => x-y,List(1,2,3)))
    println(alternate((x,y) => x+y, (x,y) => x-y,List(1,2,3,4)))
  }
}
