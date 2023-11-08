package srishti

import scala.util.{Failure, Success, Try}

class TGTraining {
  //  Function to add
  def add(firstNum: Double, secondNum: Double): Double = firstNum + secondNum

  //  Function to subtract
  def subtract(firstNum: Double, secondNum: Double): Double = firstNum - secondNum

  //  Function to multiply
  def multiply(firstNum: Double, secondNum: Double): Double = firstNum * secondNum

  //  Function to divide
  def divideTryCatch(firstNum: Int, secondNum: Int): Int = {
    // Handling Exception Using Try Catch Block
    Try(firstNum/secondNum)
    match {
      case Success(result) => result
      case Failure(e) =>
        println("Divide by Zero Exception!")
        Int.MinValue
    }
  }

  def divideEither(firstNum: Int, secondNum: Int): Either[Exception,Int] = {
    // Handling Exception Using Either[A,B]
    if(secondNum==0) Left(new ArithmeticException())
    else Right(firstNum/secondNum)
  }

  def divideIfElse(firstNum: Int, secondNum: Int): Option[Int] = {
    // Handling Exception Using if-else block
    if(secondNum==0) None
    else Some(firstNum/secondNum)
  }
}