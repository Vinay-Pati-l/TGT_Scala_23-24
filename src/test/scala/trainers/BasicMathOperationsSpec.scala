package trainers

import org.scalatest.flatspec.AnyFlatSpec

class BasicMathOperationsSpec extends AnyFlatSpec {

  val basicMathOperations = new BasicMathOperations

  behavior of "Basic Maths"

  it should "add" in {
    assert(basicMathOperations.add(1, 2) == 3)
  }

  it should "not divide" in {
    assertThrows[ArithmeticException] {
      basicMathOperations.divide(2, 0)
    }
  }
}
