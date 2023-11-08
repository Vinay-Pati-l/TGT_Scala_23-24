package mallika

import org.scalatest.funsuite.AnyFunSuite

class BasicMathProgramTest extends AnyFunSuite {

  val basicMathProgram = new BasicMathProgram

  test("BasicTest") {
    assert(basicMathProgram.add(2, 3) === 5)
  }

  test("Add0") {
    assert(basicMathProgram.add(0, 0) === 0)
  }

  test("TestNegative") {
    assert(basicMathProgram.add(-1, -3) === -4)
  }

  test("BasicTestSubtraction") {
    assert(basicMathProgram.subtract(3, 2) === 1)
  }

  test("Sub0") {
    assert(basicMathProgram.subtract(8, 0) === 8)
  }

  test("TestNegativeSubtraction") {
    assert(basicMathProgram.subtract(-1, -3) === 2)
  }

  test("BasicTestMultiplication") {
    assert(basicMathProgram.multiply(3, 8) === 24)
  }

  test("Mul0") {
    assert(basicMathProgram.multiply(8, 0) === 0)
  }

  test("TestNegativeMultiplication") {
    assert(basicMathProgram.multiply(-4, -5) === 20)
  }

  test("BasicTestDivision") {
    assert(basicMathProgram.divide(36, 12) === 3)
  }

  test("Div0") {
    assert(basicMathProgram.divide(0, 9) === 0)
  }

  test("TestNegativeDivision") {
    assert(basicMathProgram.divide(-45, -5) === 9)
  }

  test("Divisionby0") {
    assert(basicMathProgram.divide(-45, 0) === 0)
  }
}