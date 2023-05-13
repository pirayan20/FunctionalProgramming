package Homework2

object Question5 {
  def reverse(l: List[Any], acc: List[Any]): List[Any] = {
    if (l.isEmpty) return acc
    reverse(l.tail, l.head :: acc)
  }

  def palindrome(list: List[Any]): Boolean = {
    val rev = reverse(list, Nil)
    if (rev == list) true
    else false
  }

  def main(args: Array[String]) : Unit = {
    val x = List(1,2,3,2,4)
    println(palindrome(x))
  }
}
