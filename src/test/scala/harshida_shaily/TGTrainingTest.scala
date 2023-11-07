import harshida_shaily.TGTraining
import org.scalatest.flatspec.AsyncFlatSpecLike

class CalculatorTest extends AsyncFlatSpecLike {

  val mathFunctions=new TGTraining

  it should "add" in{
    assert(mathFunctions.add(1,3)==4)
  }

  it should "subtract" in{
    assert(mathFunctions.subtract(8,9)== -1)
  }

  it should "multiply" in{
    assert(mathFunctions.multiplication(9,0)==0)
  }

  //Invoking the object of the Exception class
  val divException=new divisionException

  try {
    it should "divide" in{
      assert(mathFunctions.division(9.0,0.0)== 3.0)
    }
  }catch{
    case divException=>;
  }

  it should "modulo" in{
    assert(mathFunctions.modulus(10,5)==0)
  }
}

class divisionException extends Exception{
  println("The denominator is zero which is not possible. Hence your test case is failed")
}
