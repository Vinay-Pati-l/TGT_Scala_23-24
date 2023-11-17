package trainers

import scala.annotation.tailrec

class Collection {

  def sumOfList(ls : List[Int]) = {
    @tailrec
    def loop(ls: List[Int], sum: Int): Int = {
      ls match {
        case Nil => sum
        case head :: tail =>
          val newSum = sum + head
          loop(tail, newSum)
      }
    }
    loop(ls, 0)
  }
}
