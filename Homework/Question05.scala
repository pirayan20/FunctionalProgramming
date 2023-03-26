package Homework

object Question05 {

  def myReverse(l: List[Any]): List[Any] = {
    if (l.isEmpty) return List()
    myReverse(l.tail) ++ List(l.head)
  }

  def palindrome(list: List[Any]) : Boolean = {
    var reverse = myReverse(list)
    palindrome(list,reverse)
  }

  def palindrome(l1: List[Any],l2: List[Any]): Boolean = {
    if (l1.isEmpty || l2.isEmpty) return true
    if (l1.head == l2.head) palindrome(l1.tail,l2.tail)
    else false
  }

  def main(args: Array[String]) : Unit = {
    val l = List(1,2,2,3)
    println(palindrome(l))
  }
}
