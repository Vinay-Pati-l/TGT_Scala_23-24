import harshida_shaily.mathOperations
import org.scalatest.flatspec.AsyncFlatSpecLike

import scala.util.Success
class mathOperationsTest extends AsyncFlatSpecLike {

  val mathOperations=new mathOperations

  it should "add" in{
    assert(mathOperations.add(2,3)==5)
  }

  it should "subtract" in{
    assert(mathOperations.subtract(3,9)== -6)
  }

  it should "multiply" in{
    assert(mathOperations.multiplication(9,0)==0)
  }

  it should "divide" in{
    assert(mathOperations.division(8.0,2.0)==Success(4.0))
  }

  it should "remainder" in{
    assert(mathOperations.modulo(12,7)==5)
  }
}
