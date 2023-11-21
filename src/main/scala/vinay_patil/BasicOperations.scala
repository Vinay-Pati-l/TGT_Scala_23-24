package vinay_patil

class BasicOperations{
  def Add(x: Double, y: Double): Double = {
    x + y
  }

  def AddString(x: String, y: String): String = {
    x + y
  }

  def Subtract(x: Double, y: Double): Double = {
    x - y
  }

  def Multiply(x: Double, y: Double): Double = {
    x * y
  }

  def MultiplyString(x: String, y: Int): String = {
    x * y
  }

  def DivideWithOption(x: Double, y: Double): Option[Double] = {
    if (y == 0)
      None
    else
      Some(x / y)
  }

  def DivideWithEither(x: Double, y: Double): Either[String, Double] = {
    if (y == 0)
      Left("Cannot Divide by zero")
    else
      Right(x / y)
  }

  def DivideWithTry(x: Double, y: Double): Double = {
    if (y == 0)
      throw new ArithmeticException("Cannot Divide By zero")
    else
      x / y
  }

}
