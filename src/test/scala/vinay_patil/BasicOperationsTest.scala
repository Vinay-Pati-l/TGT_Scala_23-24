package vinay_patil

import org.scalatest.funsuite.AnyFunSuite

class BasicOperationsTest extends AnyFunSuite{

val basicOperations = new BasicOperations

  test("BasicOperations.Add"){
    assert(basicOperations.Add(5, 6)==11)
    assert(basicOperations.Add(9.4, 4.5)==13.9)
    assert(basicOperations.Add('a', 5)=='f')
    assert(basicOperations.Add('A', 'B')==131)
  }

  test("BasicOperations.AddString"){
    assert(basicOperations.AddString("Scala", "Practice")=="ScalaPractice")
  }

  test("BasicOperations.Subtract"){
    assert(basicOperations.Subtract(5, 6) == -1)
    assert(basicOperations.Subtract(9.4, 4.5) == 4.9)
    assert(basicOperations.Subtract('A', 75) == -10)
    assert(basicOperations.Subtract('A', 'B') == -1)
  }

  test("BasicOperations.Multiply"){
    assert(basicOperations.Multiply(5, 6) == 30)
    assert(basicOperations.Multiply(1.0, 4.5) == 4.5)
    assert(basicOperations.Multiply('A', 5) == 325)
    assert(basicOperations.Multiply('A', 'B') == 4290)
  }

  test("BasicOperations.MultiplyString"){
    assert(basicOperations.MultiplyString("Scala", 2) == "ScalaScala")
  }

  test("Division With Option Exception Handling"){
    assert(basicOperations.DivideWithOption(12, 6).contains(2))
    assert(basicOperations.DivideWithOption(9.4, 4.5).contains(2.088888888888889))
    assert(basicOperations.DivideWithOption('A', 5).contains(13))
    assert(basicOperations.DivideWithOption('A', 'z').contains(0.5327868852459017))
    assert(basicOperations.DivideWithOption('A', 0).isEmpty)
  }

  test("Division With Either Exception Handling"){
    assert(basicOperations.DivideWithEither(12, 6)==Right(2))
    assert(basicOperations.DivideWithEither(9.4, 4.5)==Right(2.088888888888889))
    assert(basicOperations.DivideWithEither('A', 5)==Right(13))
    assert(basicOperations.DivideWithEither('A', 'z')==Right(0.5327868852459017))
    assert(basicOperations.DivideWithEither('A', 0)==Left("Cannot Divide by zero"))
  }

  test("Division With TryCatch Exception Handling"){
    assert(basicOperations.DivideWithTry(12, 6) == 2)
    assert(basicOperations.DivideWithTry(9.4, 4.5) == 2.088888888888889)
    assert(basicOperations.DivideWithTry('A', 5) == 13)
    assert(basicOperations.DivideWithTry('A', 'z') == 0.5327868852459017)
    try {
      basicOperations.DivideWithTry('A', 0)
    }
    catch {
      case e : ArithmeticException=> println(e.printStackTrace())
    }
  }

}
