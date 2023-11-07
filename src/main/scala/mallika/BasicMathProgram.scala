package mallika

import scala.util.{Try,Success,Failure}

class BasicMathProgram {
  def add(firstVal:Int, secondVal:Int):Int =
    firstVal + secondVal

  def subtract(firstVal: Int, secondVal: Int): Int =
    firstVal - secondVal

  def multiply(firstVal: Int, secondVal: Int): Int =
    firstVal * secondVal

  def divide(firstVal: Int, secondVal: Int): Int =
    Try(firstVal / secondVal) match{
      case Success(value) => value
      case Failure(exception) => 0
  }
}