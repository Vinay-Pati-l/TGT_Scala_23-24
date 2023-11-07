package m_madhav_reddy

class BasicCalculator {

  def addition(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiplication(a: Int, b: Int): Int = a * b

  //General Division function without error handling
  def division(a: Int, b: Int): Int = a / b

  //Division Exception handling using Option method
  def divisionWithOption(a:Int,b:Int): Option[Int] = {

    if(b==0){
      None
    }
    else{
      Some(a/b)
    }

  }

  //Division Exception handling using Either method
  def divisionWithEither(a: Int, b: Int): Either[String,Int] = {

    if (b == 0) {
      Left("Error")
    }
    else {
      Right(a/b)
    }

  }

}
