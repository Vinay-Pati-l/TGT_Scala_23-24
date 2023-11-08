package abhishek_bansal.basic_calculator

sealed trait ErrorInCalculations

case class DivisionByZeroError(message: String) extends ErrorInCalculations

case class InvalidOperationError(message: String) extends ErrorInCalculations

class BasicCalculator {
  def calculate(value_1: Double, value_2: Double, operation: String): Either[ErrorInCalculations, Double] = {
    operation match {
      case "Addition" => Right(value_1 + value_2)
      case "Subtraction" => Right(value_1 - value_2)
      case "Multiplication" => Right(value_1 * value_2)
      case "Division" => division(value_1, value_2)
      case "Modulus" => modulus(value_1, value_2)
      case _ => Left(InvalidOperationError("This operation is not added till now (Please choose between Addition, Subtraction, Multiplication, Division, Modulus"))
    }
  }

  private def division(value_1: Double, value_2: Double): Either[ErrorInCalculations, Double] = {
    if (value_2 != 0) Right(value_1 / value_2)
    else Left(DivisionByZeroError("Division by 0 is not allowed!"))
  }

  private def modulus(value_1: Double, value_2: Double): Either[ErrorInCalculations, Double] = {
    if (value_2 != 0) Right(value_1 % value_2)
    else Left(DivisionByZeroError("Division by 0 is not allowed!"))
  }
}
