package List

object modifyList {
  // this function is to add a certain amount to every element in the list
  def add(s:List[Int], a: Int) : List[Int] = {
    if (s.isEmpty){
      return List()
    }

    (s.head + a) :: add(s.tail,a)
  }
}
