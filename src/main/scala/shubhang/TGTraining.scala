package shubhang
import scala.util.{Success,Failure, Try}

class TGTraining(num1:Int,num2:Int) {
  def add(): Int = {
    num1 + num2
  }

  def subtract(): Int = {
    num1 - num2
  }

  def multiply(): Int = {
    num1 * num2
  }

  def divide(): Int = {
    val result = Try(num1 / num2)
    result match {
      case Success(value) => value
      case Failure(exception) => println(exception)
      Int.MaxValue// in case of division with zero
    }
  }
}
