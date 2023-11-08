package abhishek_bansal.basic_calculator

sealed trait ErrorInCalculations

case class DivisionByZeroError(message: String) extends ErrorInCalculations

case class InvalidOperationError(message: String) extends ErrorInCalculations

class BasicCalculator {
  def calculate(valueOne: Double, valueTwo: Double, operation: String): Either[ErrorInCalculations, Double] = {
    operation match {
      case "Addition" => Right(valueOne + valueTwo)
      case "Subtraction" => Right(valueOne - valueTwo)
      case "Multiplication" => Right(valueOne * valueTwo)
      case "Division" => division(valueOne, valueTwo)
      case "Modulus" => modulus(valueOne, valueTwo)
      case _ => Left(InvalidOperationError("This operation is not added till now (Please choose between Addition, Subtraction, Multiplication, Division, Modulus"))
    }
  }

  private def division(value1: Double, value2: Double): Either[ErrorInCalculations, Double] = {
    if (value2 != 0) Right(value1 / value2)
    else Left(DivisionByZeroError("Division by 0 is not allowed!"))
  }

  private def modulus(value1: Double, value2: Double): Either[ErrorInCalculations, Double] = {
    if (value2 != 0) Right(value1 % value2)
    else Left(DivisionByZeroError("Division by 0 is not allowed!"))
  }
}
