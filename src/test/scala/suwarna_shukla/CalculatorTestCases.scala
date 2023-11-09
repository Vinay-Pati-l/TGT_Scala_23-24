import org.scalatest.funsuite.AnyFunSuite

//all test cases with negative test cases also
class CalculatorTestCases extends AnyFunSuite {

  val testCases = new BasicCalculator()

  //All possible addition test cases

  test("BasicAdditionTest") {
    assert(testCases.sum(2,3)=== 5)
  }

  test("AdditionOfZeroes") {
    assert(testCases.sum(0,0) === 0)
  }

  test("BothNegativeNumberAddition") {
    assert(testCases.sum(-1, -3) === -4)
  }

  test("OneNumberNegativeAdd"){
    assert(testCases.sum(-4,10)=== 6)
    assert(testCases.sum(-10,4)=== -6)
  }

  //All possible subtraction test cases

  test("BasicSubtractionTest") {
    assert(testCases.sub(3, 2) === 1)
  }

  test("SubtractionOfZeroes") {
    assert(testCases.sub(0, 0) === 0)
    assert(testCases.sub(8, 0) === 8)
  }

  test("BothNegativeNumberSubtraction") {
    assert(testCases.sub(-1, -3) === 2)
  }

  test("OneNumberNegativeSub") {
    assert(testCases.sub(-4, 10) === -14)
    assert(testCases.sub(4, -10) === 14)
  }

  //All possible multiplication test cases

  test("BasicMultiplicationTest") {
    assert(testCases.mul(3, 8) === 24)
  }

  test("MultiplicationOfZeroes") {
    assert(testCases.mul(0, 0) === 0)
    assert(testCases.mul(8, 0) === 0)
  }

  test("BothNegativeNumberMultiplication") {
    assert(testCases.mul(-4,-5) === 20)
  }

  test("OneNumberNegativeMul") {
    assert(testCases.mul(-4, 10) === -40)
  }

  //All possible division test cases

  test("BasicDivisionTest") {
    assert(testCases.div(36,12) === 3)
  }

  test("BothNegativeNumberDivision") {
    assert(testCases.div(-45, -5) === 9)
  }

  test("OneNegativeNumberDivision") {
    assert(testCases.div(-45, 5) === -9)
    assert(testCases.div(45, -5) === -9)
  }

  test("DivisionWhenNumeZero") {
    assert(testCases.div(0, 9) === 0)
  }

  test("DivisionWhenDenoZero") {
    assertThrows[ArithmeticException]{
      testCases.div(6,0)
    }
  }

}