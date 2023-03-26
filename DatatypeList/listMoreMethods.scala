package DatatypeList

object listMoreMethods {
  def member(x: Any, l: List[Any]) : Boolean = {
    if (l.isEmpty) false
    if (l.head == x) true
    else member(x,l.tail)
  }

  def sorted(l: List[Int]) : Boolean = {
    if (l.length <= 1) true
    else if (l.tail.head <= l.head) false
    else sorted(l.tail)
  }

  def delete(x: Any, l: List[Any]) : List[Any] = {
    if (l.isEmpty) List()
    else if (x == l.head) delete(x,l.tail)
    else l.head :: delete(x,l.tail)
  }

  def length(l: List[Any]) : Int = {
    length(l,0)
  }

  def length(l:List[Any], a: Int) : Int = {
    if (l.isEmpty) return a
    else length(l.tail,a+1)
  }
}
