package abhijeet_gaurav

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper


class CollectionTest extends AnyFlatSpec {


  //behavior of "Basic Maths"
  var obj = new Collection
  "lastUsingTailRecursion" should "return the last element of a non-empty list" in {
    val myList = List(1, 2, 3, 4, 5)
    obj.lastUsingTailRecursion(myList) shouldEqual Some(5)
  }

  it should "return None for an empty list" in {
    val emptyList = List.empty[Int]
    obj.lastUsingTailRecursion(emptyList) shouldEqual None
  }

  it should "return the only element for a single-element list" in {
    val singleElementList = List(42)
    obj.lastUsingTailRecursion(singleElementList) shouldEqual Some(42)
  }

  it should "return the last element for a list with repeated elements" in {
    val repeatedList = List(1, 2, 3, 3, 4, 4, 4)
    obj.lastUsingTailRecursion(repeatedList) shouldEqual Some(4)
  }

  "reverseUsingTailRecursion" should "reverse the list" in {
    val originalList = List(1, 2, 3, 4, 5)
    val reversedList = obj.reverseUsingTailRecursion(originalList)
    assert(reversedList === List(5, 4, 3, 2, 1))
  }

  it should "handle an empty list" in {
    val originalList = List.empty[Int]
    val reversedList = obj.reverseUsingTailRecursion(originalList)
    assert(reversedList === List.empty[Int])
  }
}

