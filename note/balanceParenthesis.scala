package note

object balanceParenthesis {
  def balance(chars: List[Char]) : Boolean = {
    balance(chars,0)
  }

  def balance(chars: List[Char], acc: Int) : Boolean = {
    if (chars.isEmpty && acc == 0) true
    else if (chars.isEmpty && acc != 0) false
    else if (acc < 0) false
    else if (chars.head != '(' && chars.head != ')') balance(chars.tail, acc)
    else if (chars.head == '(') balance(chars.tail,acc+1)
    else balance(chars.tail,acc-1)       // find ')'
  }

  def main(args: Array[String]) : Unit = {
    println(balance("(if(zero?x) max(/1 x) )".toList))
  }
}
