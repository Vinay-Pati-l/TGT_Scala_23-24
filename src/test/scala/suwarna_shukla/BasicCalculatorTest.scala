import org.scalatest.funsuite.AnyFunSuite

//all test cases with negative test cases also
class BasicCalculatorTest extends AnyFunSuite {

  val basicCalculator = new BasicCalculator()

  //All possible addition test cases

  test("BasicAdditionTest") {
    assert(basicCalculator.sum(2,3)=== 5)
  }

  test("AdditionOfZeroes") {
    assert(basicCalculator.sum(0,0) === 0)
  }

  test("BothNegativeNumberAddition") {
    assert(basicCalculator.sum(-1, -3) === -4)
  }

  test("OneNumberNegativeAdd"){
    assert(basicCalculator.sum(-4,10)=== 6)
    assert(basicCalculator.sum(-10,4)=== -6)
  }

  //All possible subtraction test cases

  test("BasicSubtractionTest") {
    assert(basicCalculator.sub(3, 2) === 1)
  }

  test("SubtractionOfZeroes") {
    assert(basicCalculator.sub(0, 0) === 0)
    assert(basicCalculator.sub(8, 0) === 8)
  }

  test("BothNegativeNumberSubtraction") {
    assert(basicCalculator.sub(-1, -3) === 2)
  }

  test("OneNumberNegativeSub") {
    assert(basicCalculator.sub(-4, 10) === -14)
    assert(basicCalculator.sub(4, -10) === 14)
  }

  //All possible multiplication test cases

  test("BasicMultiplicationTest") {
    assert(basicCalculator.mul(3, 8) === 24)
  }

  test("MultiplicationOfZeroes") {
    assert(basicCalculator.mul(0, 0) === 0)
    assert(basicCalculator.mul(8, 0) === 0)
  }

  test("BothNegativeNumberMultiplication") {
    assert(basicCalculator.mul(-4,-5) === 20)
  }

  test("OneNumberNegativeMul") {
    assert(basicCalculator.mul(-4, 10) === -40)
  }

  //All possible division test cases

  test("BasicDivisionTest") {
    assert(basicCalculator.div(36,12) === 3)
  }

  test("BothNegativeNumberDivision") {
    assert(basicCalculator.div(-45, -5) === 9)
  }

  test("OneNegativeNumberDivision") {
    assert(basicCalculator.div(-45, 5) === -9)
    assert(basicCalculator.div(45, -5) === -9)
  }

  test("DivisionWhenNumeZero") {
    assert(basicCalculator.div(0, 9) === 0)
  }

  test("DivisionWhenDenoZero") {
    assertThrows[ArithmeticException]{
      basicCalculator.div(6,0)
    }
  }

}