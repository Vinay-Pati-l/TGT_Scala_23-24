package trainers

class Recursion {

  def factorialRecursive(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialRecursive(n - 1)
  }
}
