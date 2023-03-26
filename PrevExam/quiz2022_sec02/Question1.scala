package PrevExam.quiz2022_sec02

object Question1 {
  def applySeq(x: Int)(fList:List[Int => Int]) : Int = {
    if (fList.isEmpty) return x
    else applySeq(fList.head(x))(fList.tail)
  }
}
