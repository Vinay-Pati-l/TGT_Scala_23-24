package kushagra

import org.scalatest.funsuite.AnyFunSuite
// Matchers have been used to assert an exception which can be arisen
// in case of division by ZERO, therefore used "intercept" method
// to catch the exception and "should be" as matcher to assert the Exception
import org.scalatest.matchers.should.Matchers

class CalculationOperationsTest extends AnyFunSuite with Matchers {
  val calculationOperations = new CalculationOperations()

  test("Addition test for Negative values") {
    assert(calculationOperations.addition(-63, -98) == -161)
  }

  test("Difference test") {
    assert(calculationOperations.difference(90189, 3910) == 86279)
  }

  test("Difference test with negative numbers") {
    assert(calculationOperations.difference(-50, -50) == 0)
  }

  test("Product test for large numbers") {
    assert(calculationOperations.product(758483, 43458) == 32962154214L)
  }

  test("Product test for negative values") {
    assert(calculationOperations.product(75, -2) == -150)
  }

  test("Division test") {
    assert(calculationOperations.division(37, 23) == 1.608695652173913)
  }

  test("Division_Exception (Division by Zero)") {
    // ***** Learnt about intercept and Matchers *****
    val exception_occurred = intercept[IllegalArgumentException] {
      calculationOperations.division(17, 0)
    }
    exception_occurred.getMessage should be("Division by zero is not allowed!!")
  }

  test("findingRemainder with dividend < divisor") {
    assert(calculationOperations.find_remainder(4, 8) == 4)
  }

  test("findingRemainder in case of fully divisible numbers") {
    assert(calculationOperations.find_remainder(8, 4) == 0)
  }

  test("findingRemainder in case of non-divisible numbers") {
    assert(calculationOperations.find_remainder(4, 3) == 1)
  }
}
