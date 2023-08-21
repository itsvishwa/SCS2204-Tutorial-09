class Acct(initialBalance: Double = 0.0) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else {
      println("Invalid withdrawal amount or insufficient balance.")
    }
  }

  def transfer(amount: Double, toAcct: Acct): Unit = {
    if (amount > 0 && amount <= balance) {
      withdraw(amount)
      toAcct.deposit(amount)
    } else {
      println("Invalid transfer amount or insufficient balance.")
    }
  }

  def getBalance: Double = balance
}

object Question03 extends App {

    val Acct1 = new Acct(1000.0)
    val Acct2 = new Acct(500.0) 

    println(s"Acct 1 balance: ${Acct1.getBalance}")
    println(s"Acct 2 balance: ${Acct2.getBalance}")   

    Acct1.deposit(200.0)
    Acct1.withdraw(300.0)    
    Acct1.transfer(150.0, Acct2)  

    println(s"Acct 1 balance: ${Acct1.getBalance}")
    println(s"Acct 2 balance: ${Acct2.getBalance}")

}
