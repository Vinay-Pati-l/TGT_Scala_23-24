package abhijeet_gaurav
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PalindromeTest extends AnyFlatSpec with Matchers {

  it should "return true for a palindrome string" in {
    val palindromeString = "racecar"
    Palindrome.isPalindrome(palindromeString) should be(true)
  }

  it should "return false for a non-palindrome string" in {
    val nonPalindromeString = "hello"
    Palindrome.isPalindrome(nonPalindromeString) should be(false)
  }

  it should "return true for an empty string" in {
    val emptyString = ""
    Palindrome.isPalindrome(emptyString) should be(true)
  }
}

