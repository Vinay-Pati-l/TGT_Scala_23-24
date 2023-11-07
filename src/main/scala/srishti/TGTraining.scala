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

object Main
{
  //  Main Function
  def main(args: Array[String]): Unit = {
    println(s"Addition of 21 and 10 is: ${new TGTraining().add(21,10)}")
    println(s"Subtraction of 32 and 10 is: ${new TGTraining().subtract(32,10)}")
    println(s"Multiplication of 5 and 6 is: ${new TGTraining().multiply(5,6)}")
    println(s"Division of 10 and 0 is: ${new TGTraining().divideTryCatch(10,0)}")
  }
}