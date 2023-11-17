package anish_kumar

import org.scalatest.flatspec.AnyFlatSpec

class ArithmeticSpec extends AnyFlatSpec {

  private val arithmetic = new Arithmetic

  behavior of "Basic Arithmetic Operations"

  it should "add" in {
    assert(arithmetic.add(1, 2) == 3)
  }

  it should "subtract" in {
    assert(arithmetic.subtract(5,2) == 3)
  }

  it should "multiply" in {
    assert(arithmetic.multiply(3,4) == 12)
  }

  it should "divide" in {
    assert(arithmetic.divide(5,2) == 2)
    }
}
