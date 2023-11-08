package harshida_shaily

import scala.util.{Failure, Try}

class mathOperations {
  def add(firstValue: Int, secondValue: Int): Int = firstValue+secondValue

  def subtract(firstValue: Int, secondValue: Int): Int = {
    firstValue-secondValue
  }

  def multiplication(firstValue: BigInt, secondValue: BigInt) = firstValue*secondValue

  def division(firstValue: Double, secondValue: Double):Try[Double]= {
    if   (secondValue==0.0) {
      Failure(new IllegalArgumentException(("Division by zero is not possible")))
    }
    else {
      Try(firstValue/secondValue)
    }
  }
  def modulo(firstValue: Int, secondValue: Int):Int= {
    firstValue%secondValue
  }
}
