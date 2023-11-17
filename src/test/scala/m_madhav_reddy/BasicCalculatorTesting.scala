package m_madhav_reddy

import org.scalatest.funsuite.AnyFunSuite

class BasicCalculatorTesting extends  AnyFunSuite {

  val basicCalculator = new BasicCalculator

  test("addition of two numbers") {

    assert(basicCalculator.addition(10, 20) == 30)

    assert(basicCalculator.addition(-5,-3) == -8)

  }

  test("Sustraction of two numbers") {

    assert(basicCalculator.subtract(10, 20) == -10)

    assert(basicCalculator.subtract(5, 3) == 2)

  }

  test("multiplication of two numbers") {

    assert(basicCalculator.multiplication(10, 20) == 200)

    assert(basicCalculator.multiplication(10, 0) == 0)

  }

  test("divison of two numbers") {

    assert(basicCalculator.division(20, 10) == 2)

    assert(basicCalculator.division(10, 20) == 0)

  }

  test("Division with Zero"){

    assertThrows[ArithmeticException](basicCalculator.division(10, 0))

    //TestCase for Exception Handling using Option
    assert(basicCalculator.divisionWithOption(5, 0).isEmpty)
    assert(basicCalculator.divisionWithOption(5, 5).isDefined)

    //TestCase for Exception Handling using Either
    assert(basicCalculator.divisionWithEither(5, 0).isLeft)
    assert(basicCalculator.divisionWithEither(5, 5).isRight)

  }

}


