package trainers

import scala.annotation.tailrec

class TailRecursion {

  def factorialTailRecursive(n: Int): Int = {
    @tailrec
    def factorialHelper(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else factorialHelper(n - 1, n * acc)
    }

    if (n <= 1) 1
    else factorialHelper(n, 1)
  }
}
