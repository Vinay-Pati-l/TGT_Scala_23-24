package kushagra

class CalculationOperations {

  def addition(numOne: Long, numTwo: Long): Long = {
    return (numOne + numTwo)
  }

  def difference(numOne: Long, numTwo: Long): Long = {
    return (numOne - numTwo)
  }

  def product(numOne: Long, numTwo: Long): Long = {
    return (numOne * numTwo)
  }

  // dividend is taken in Double to ensure the calculation happens
  // in floating-point arithmetic (int case of Division)
  def division(dividend: Double, divisor: Int): Double = {
    if (divisor == 0) throw new IllegalArgumentException("Division by zero is not allowed!!")
    return (dividend / divisor)
  }

  def find_remainder(dividend: Int, divisor: Int): Int = {
    return (dividend % divisor)
  }
}