package shubhang

import org.scalatest.funsuite.AnyFunSuite


class TGTrainingTest extends AnyFunSuite {
  val tgtTrainingObject = new TGTraining
  test("TGTraining.add") {
    assert(tgtTrainingObject.add(3,4) === 7)
    assert(tgtTrainingObject.add(-3,9) === 6)
  }

  test("TGTraining.subtract") {
    assert(tgtTrainingObject.subtract(5,2) === 3)
    assert(tgtTrainingObject.subtract(-5,-2) === -3)
  }

  test("TGTraining.multiply") {
    assert(tgtTrainingObject.multiply(5,2) === 10)
    assert(tgtTrainingObject.multiply(-5,-7) === 35)
  }

  test("TGTraining.divide") {
    assert(tgtTrainingObject.divide(-500,-100) == 5)
    assert(tgtTrainingObject.divide(200,0) == Int.MaxValue) // division with zero it gets an undefined value
  }
}

