package trainers

class LoopExamples {

  def forLoopExample(): Unit = {
    for (i <- 1 to 5) {
      println(i)
    }
  }

  def whileLoopExample(): Unit = {
    var i = 1
    while (i <= 5) {
      println(i)
      i += 1
    }
  }

  def doWhileLoopExample(): Unit = {
    var i = 1
    do {
      println(i)
      i += 1
    } while (i <= 5)
  }

  def functionalLoopExample(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val doubled = numbers.map(_ * 2)
    println(doubled)
  }

  def forComprehensionExample(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val squaredEvens = for {
      n <- numbers
      if n % 2 == 0
    } yield n * n
    println(squaredEvens)
  }
}
