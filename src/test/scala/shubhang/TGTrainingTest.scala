package shubhang

import org.scalatest.funsuite.AnyFunSuite

import scala.util.Failure

class TGTrainingTest extends AnyFunSuite {
  test("TGTraining.add") {
    assert(new TGTraining(3, 4).add() === 7)
    assert(new TGTraining(-3, 9).add() === 6)
  }

  test("MathsOperation.subtract") {
    assert(new TGTraining(5, 2).subtract() === 3)
    assert(new TGTraining(-5, -2).subtract() === -3)
  }

  test("MathsOperation.multiply") {
    assert(new TGTraining(5, 2).multiply() === 10)
    assert(new TGTraining(-5, -7).multiply() === 35)
  }

  test("MathsOperation.divide") {
    assert(new TGTraining(-500, -100).divide() == 5)
    assert(new TGTraining(200, 0).divide() == Int.MaxValue) // division with zero
  }
}

