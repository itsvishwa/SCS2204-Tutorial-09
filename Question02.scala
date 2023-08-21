class Rational02(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  val numer: Int = n
  val denom: Int = d

  def sub(other: Rational02): Rational02 = {
    new Rational02(numer * other.denom - other.numer * denom, denom * other.denom)
  }

  def printRational: String = s"$numer/$denom"
}


object Question02 extends App{
    val x = Rational02(10, 3)
    val y = Rational02(5, 8)
    val z = Rational02(2, 7)
    
    val result = (x.sub(y)).sub(z)
    println(result.printRational)
}