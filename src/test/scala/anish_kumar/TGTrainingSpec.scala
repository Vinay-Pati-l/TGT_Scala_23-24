package anish_kumar

import org.scalatest.flatspec.AnyFlatSpec

class TGTrainingSpec extends AnyFlatSpec {

  val tgtraining = new TGTraining

  behavior of "Welcome to Scala Unit Test Assignment 1"

  it should "add" in {
    assert(tgtraining.add(1, 2) == 3)
  }

  it should "subtract" in {
    assert(tgtraining.subtract(5,2) == 3)
  }

  it should "multiply" in {
    assert(tgtraining.multiply(3,4) == 12)
  }

  it should "divide" in {
    assert(tgtraining.divide(5,2) == 2)
    }

}
