package abhijeet_gaurav

class Palindrome {
  def isPalindrome(st: String): Boolean = {
    val len = st.length

    for (i <- 0 until len / 2) {
      if (st(i) != st(len - i - 1))
        return false
    }

    true
  }
}

object PalindromeApp extends App {
  val str = "aaA"
  val palindromeObj = new Palindrome

  if (palindromeObj.isPalindrome(str)) {
    println(s"$str is a palindrome.")
  } else {
    println(s"$str is not a palindrome.")
  }
}

