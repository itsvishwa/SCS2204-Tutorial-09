class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  val numer: Int = n
  val denom: Int = d

  def neg: Rational = new Rational(-numer, denom)

  def printRational: String = s"$numer/$denom"
}


object Question01 extends App{
    val a = Rational(10, 3)
    println(a.printRational)
    val negA = a.neg
    println(negA.printRational)
}