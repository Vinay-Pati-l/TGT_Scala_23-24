package abhijeet_gaurav

import org.scalatest.flatspec.AnyFlatSpec

class MathOperationTest extends AnyFlatSpec{

  val obj = new MathOperation

  it should "add" in {
    assert(obj.addition(5, 2) == 7)
  }

  it should "subtract" in {
    assert(obj.subtraction(15, 8) == 7)
  }

  it should "multiply" in {
    assert(obj.multiplication(13, 4) == 52)
  }

  it should "divide" in {
    assert(obj.division(55.0, 2.0) == 27.5)
  }
}
