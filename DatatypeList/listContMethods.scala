package DatatypeList

import DatatypeList.listMoreMethods.member

object listContMethods {
  def append(l1: List[Any], l2: List[Any]) : List[Any] = {
    if (l1.isEmpty) return l2
    if (l2.isEmpty) return l1
    val t2 = append(l1.tail,l2)
    return l1.head :: t2
  }
  def myReverse(l: List[Any]) : List[Any] = {
    if (l.isEmpty) return List()
    myReverse(l.tail) ++ List(l.head)
  }

  def dot(l1:List[Int], l2:List[Int]) : Int = {
    if (l1.isEmpty || l2.isEmpty) return 0
    else dot(l1.tail,l2.tail) + (l1.head * l2.head)
  }

  def max(l: List[Int]) : Int = {
    if (l.isEmpty) return -1
    if (l.length == 1) return l.head
    if (l.head < (l.tail).head) max(l.tail)
    else max(l.head :: l.tail.tail)
  }

  def setify(l:List[Any]) : List[Any] = {
    if (l.isEmpty) return List()
    if (member(l.head,l.tail)){
      return setify(l.tail)
    } else {
      return l.head :: setify(l.tail)
    }
  }

  def main(args : Array[String]) : Unit = {
    var myList: List[Int] = List(6,1,7,2)
    var myList2 = List(1,2,3)
    println(max(myList))
    println(dot(myList,myList2))
  }
}
