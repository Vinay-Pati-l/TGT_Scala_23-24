package kushagra
class CalculationOperations {
  def addition(num1: Long, num2: Long): Long = {
    return (num1 + num2)
  }
  def difference(num1: Long, num2: Long): Long = {
    return (num1 - num2)
  }
  def product(num1: Long, num2: Long): Long = {
    return (num1 * num2)
  }
  def division(dividend: Double, divisor: Int): Double = {
    // dividend is taken in Double to ensure the calculation happens
    // in floating-point arithmetic
    if (divisor == 0) throw new IllegalArgumentException("Division by zero is not allowed!!")
    return (dividend / divisor)
  }
  def find_remainder(dividend: Int, divisor: Int): Int = {
    return (dividend % divisor)
  }
}
