package vinay_patil

import org.scalatest.funsuite.AnyFunSuite

class BasicOperationsTest extends AnyFunSuite{
val Operator = new BasicOperations
  test("BasicOperations.Add") {
    assert(Operator.Add(5, 6)==11)
    assert(Operator.Add(9.4, 4.5)==13.9)
    assert(Operator.Add('a', 5)=='f')
    assert(Operator.Add('A', 'B')==131)
  }
  test("BasicOperations.AddString"){
    assert(Operator.AddString("Scala", "Practice")=="ScalaPractice")
  }
  test("BasicOperations.Subtract") {
    assert(Operator.Subtract(5, 6) == -1)
    assert(Operator.Subtract(9.4, 4.5) == 4.9)
    assert(Operator.Subtract('A', 75) == -10)
    assert(Operator.Subtract('A', 'B') == -1)
  }
  test("BasicOperations.Multiply") {
    assert(Operator.Multiply(5, 6) == 30)
    assert(Operator.Multiply(1.0, 4.5) == 4.5)
    assert(Operator.Multiply('A', 5) == 325)
    assert(Operator.Multiply('A', 'B') == 4290)
  }
  test("BasicOperations.MultiplyString") {
    assert(Operator.MultiplyString("Scala", 2) == "ScalaScala")
  }
  test("Division With Option Exception Handling") {
    assert(Operator.DivideWithOption(12, 6).contains(2))
    assert(Operator.DivideWithOption(9.4, 4.5).contains(2.088888888888889))
    assert(Operator.DivideWithOption('A', 5).contains(13))
    assert(Operator.DivideWithOption('A', 'z').contains(0.5327868852459017))
    assert(Operator.DivideWithOption('A', 0).isEmpty)
  }
  test("Division With Either Exception Handling"){
    assert(Operator.DivideWithEither(12, 6)==Right(2))
    assert(Operator.DivideWithEither(9.4, 4.5)==Right(2.088888888888889))
    assert(Operator.DivideWithEither('A', 5)==Right(13))
    assert(Operator.DivideWithEither('A', 'z')==Right(0.5327868852459017))
    assert(Operator.DivideWithEither('A', 0)==Left("Cannot Divide by zero"))
  }
  test("Division With TryCatch Exception Handling") {

    assert(Operator.DivideWithTry(12, 6) == 2)
    assert(Operator.DivideWithTry(9.4, 4.5) == 2.088888888888889)
    assert(Operator.DivideWithTry('A', 5) == 13)
    assert(Operator.DivideWithTry('A', 'z') == 0.5327868852459017)
    try {
      Operator.DivideWithTry('A', 0)
    }
    catch {
      case e : ArithmeticException=> println(e.printStackTrace())
    }
  }

}
