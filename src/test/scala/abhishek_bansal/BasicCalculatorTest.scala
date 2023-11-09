package abhishek_bansal

import abhishek_bansal.basic_calculator.{BasicCalculator, DivisionByZeroError, InvalidOperationError}
import org.scalatest.funsuite.AnyFunSuite

class BasicCalculatorTest extends AnyFunSuite {

  val basicCalculator = new BasicCalculator()

  test("All basic test cases") {
    assert(basicCalculator.calculate(10, 5, "Addition") == Right(15.0))
    assert(basicCalculator.calculate(10, 5, "Subtraction") == Right(5.0))
    assert(basicCalculator.calculate(10, 5, "Multiplication") == Right(50.0))
    assert(basicCalculator.calculate(10, 5, "Division") == Right(2.0))
    assert(basicCalculator.calculate(10, 5, "Modulus") == Right(0.0))
  }

  test("Negative number addition test cases") {
    assert(basicCalculator.calculate(10, -5, "Addition") == Right(5.0))
    assert(basicCalculator.calculate(-10, 5, "Addition") == Right(-5.0))
    assert(basicCalculator.calculate(-10, -5, "Addition") == Right(-15.0))
  }

  test("Negative number subtraction test cases") {
    assert(basicCalculator.calculate(10, -5, "Subtraction") == Right(15.0))
    assert(basicCalculator.calculate(-10, 5, "Subtraction") == Right(-15.0))
    assert(basicCalculator.calculate(-10, -5, "Subtraction") == Right(-5.0))
  }

  test("Negative number multiplication test cases") {
    assert(basicCalculator.calculate(10, -5, "Multiplication") == Right(-50.0))
    assert(basicCalculator.calculate(-10, 5, "Multiplication") == Right(-50.0))
    assert(basicCalculator.calculate(-10, -5, "Multiplication") == Right(50.0))
  }

  test("Negative number Division test cases") {
    assert(basicCalculator.calculate(10, -5, "Division") == Right(-2.0))
    assert(basicCalculator.calculate(-10, 5, "Division") == Right(-2.0))
    assert(basicCalculator.calculate(-10, -5, "Division") == Right(2.0))
  }

  test("Negative number Modulus test cases") {
    assert(basicCalculator.calculate(10, -5, "Modulus") == Right(0.0))
    assert(basicCalculator.calculate(-10, 5, "Modulus") == Right(0.0))
    assert(basicCalculator.calculate(-10, -5, "Modulus") == Right(0.0))
  }

  test("Division by 0 test cases") {
    assert(basicCalculator.calculate(10, 0, "Division") == Left(DivisionByZeroError("Division by 0 is not allowed!")))
  }

  test("Modulo by 0 test cases") {
    assert(basicCalculator.calculate(10, 0, "Modulus") == Left(DivisionByZeroError("Division by 0 is not allowed!")))
  }

  test("Invalid Operation") {
    assert(basicCalculator.calculate(10, 10, "Anything") == Left(InvalidOperationError("This operation is not added till now (Please choose between Addition, Subtraction, Multiplication, Division, Modulus")))
  }
}
