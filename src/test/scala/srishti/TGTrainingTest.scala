package srishti

import org.scalatest.flatspec.AnyFlatSpec

class TGTrainingTest extends AnyFlatSpec {
  val tgtTraining = new TGTraining()

  "Add function" should "add two numbers" in{
    assert(tgtTraining.add(5,9) ==14)
  }

  "Subtract function" should "subtract two numbers" in{
    assert(tgtTraining.subtract(10,6) ==4)
  }

  "Multiply function" should "multiply two numbers" in{
    assert(tgtTraining.multiply(40,2) ==80)
  }

  "Divide function" should "divide two numbers" in{
    assert(tgtTraining.divideTryCatch(72,8) ==9)
  }

  it should "produce ArithmeticException when the number is attempted to divide by 0" in{
    assertThrows[java.lang.ArithmeticException]{
      tgtTraining.divideTryCatch(10,0)
    }
  }
}