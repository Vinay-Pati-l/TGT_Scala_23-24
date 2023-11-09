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
/*
We test the methods by separate test cases
object Calculate
{
  def main(args: Array[String]) =
  {
    val operation = new BasicCalculator()
    try {
      println("Addition: " + operation.sum(10, 2))

      println("Subtraction: " + operation.sub(10, 2))

      println("Multiplication: " + operation.mul(10, 2))

      println("Division: " + operation.div(10, 2))

      //exception
      println("Division: " + operation.div(10, 0))
    }
    catch {
      case e: ArithmeticException =>
        println("An arithmetic exception occurred: " + e.getMessage)

      case ex: Exception =>
        println("An unexpected exception occurred: " + ex.getMessage)
    }
  }
}*/
