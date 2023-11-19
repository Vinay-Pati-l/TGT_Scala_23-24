package abhijeet_gaurav
import scala.annotation.tailrec
class Collection {

  // Function to find the last element in the list.
  def lastUsingTailRecursion(ls: List[Int]): Option[Int] = {
    @tailrec
    def findLast(list: List[Int], currentLast: Option[Int]): Option[Int] = {
    list match {
    case Nil => currentLast
    case head :: tail => findLast (tail, Some (head) )
     }
  }

    findLast (ls, None)
  }
  // Function to reverse the list.
  def reverseUsingTailRecursion(ls: List[Int]): List[Int] = {
    @tailrec
    def reverseHelper(original: List[Int], reversed: List[Int]): List[Int] = {
      original match {
        case Nil => reversed
        case head :: tail => reverseHelper(tail, head :: reversed)
      }
    }

    reverseHelper(ls, Nil)
  }

  // Function to find the last element in the list.
  //def lastUsingInBuildMethod(ls: List[Int]): Int = ???

  // Function to reverse the list.
  //def reverseUsingInBuildMethod(ls: List[Int]): List[Int] = ???
}
