package srishti

import scala.util.{Failure, Success, Try}

class TGTraining {
  //  Function to add
  def add(a: Double, b: Double): Double = a + b

  //  Function to subtract
  def subtract(a: Double, b: Double): Double = a - b

  //  Function to multiply
  def multiply(a: Double, b: Double): Double = a * b

  //  Function to divide
  def divideTryCatch(a: Int, b: Int): Int = {
    // Handling Exception Using Try Catch Block
    Try(a/b)
    match {
      case Success(value) => value
      case Failure(e) =>
        println("Divide by Zero Exception!")
        Int.MinValue
    }
  }

  def divideEither(a: Int, b: Int): Either[Exception,Int] = {
    // Handling Exception Using Either[A,B]
    if(b==0) Left(new ArithmeticException())
    else Right(a/b)
  }

  def divideIfElse(a: Int, b: Int): Option[Int] = {
    // Handling Exception Using if-else block
    if(b==0) None
    else Some(a/b)
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
