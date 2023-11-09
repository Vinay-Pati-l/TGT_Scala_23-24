package shubhang

import org.scalatest.funsuite.AnyFunSuite


class TGTrainingTest extends AnyFunSuite {
  val trainingObject = new TGTraining
  test("TGTraining.add") {
    assert(trainingObject.add(3,4) === 7)
    assert(trainingObject.add(-3,9) === 6)
  }

  test("TGTraining.subtract") {
    assert(trainingObject.subtract(5,2) === 3)
    assert(trainingObject.subtract(-5,-2) === -3)
  }

  test("TGTraining.multiply") {
    assert(trainingObject.multiply(5,2) === 10)
    assert(trainingObject.multiply(-5,-7) === 35)
  }

  test("TGTraining.divide") {
    assert(trainingObject.divide(-500,-100) == 5)
    assert(trainingObject.divide(200,0) == Int.MaxValue) // division with zero it gets an undefined value
  }
}

