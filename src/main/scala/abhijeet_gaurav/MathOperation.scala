package abhijeet_gaurav

import scala.util.Failure

import scala.util.{Try, Success, Failure}

class MathOperation {

  def addition(firstVal: Int, secondVal: Int): Int = {
    firstVal + secondVal
  }

  def subtraction(firstVal: Int, secondVal: Int): Int = {
    firstVal - secondVal
  }

  def multiplication(firstVal: Int, secondVal: Int): Int = {
    firstVal * secondVal
  }

  def division(firstVal: Double, secondVal: Double): Double = {
    Try{
      if(secondVal == 0){
        throw new ArithmeticException("divided by zero not allowed")
      }
      firstVal / secondVal
    }
    match{
      case Success(result)=> result
      case Failure(exception) =>
        println("error")
        0.0
    }

  }

}
