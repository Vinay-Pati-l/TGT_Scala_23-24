class BasicCalculator {
  def sum(numOne: Int, numTwo: Int): Int = numOne + numTwo

  def sub(numOne: Int, numTwo: Int): Int = numOne - numTwo

  def mul(numOne: Int, numTwo: Int): Long = numOne * numTwo

  def div(numOne: Int, numTwo: Int): Double = {
    if (numTwo != 0) {
      numOne.toDouble / numTwo
    } else {
      throw new ArithmeticException("Division by zero is not allowed.")
    }
  }
}
