package shubhang
import scala.util.{Success,Failure, Try}

class TGTraining() {
  def add(num1:Int,num2:Int): Int = {
    num1 + num2
  }

  def subtract(num1:Int,num2:Int): Int = {
    num1 - num2
  }

  def multiply(num1:Int,num2:Int): Int = {
    num1 * num2
  }

  def divide(num1:Int,num2:Int): Int = {
    val result = Try(num1 / num2)
    result match {
      case Success(value) => value
      case Failure(exception) => println(exception)
      Int.MaxValue// in case of division with zero return a undefined value
    }
  }
}
