package abhijeet_gaurav

object Palindrome extends App {
  def isPalindrome(st: String): Boolean = {
    val len = st.length
    for (i <- 0 until len / 2) {
      if (st(i) != st(len - i - 1))
        return false
    }

    true
  }
}

