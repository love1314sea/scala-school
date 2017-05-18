package _06_对象

/*
一个类，希望它有静态函数和静态变量，就使用伴生对象
 */
class Account {
  private var balance = 0.0
  val id = Account.newUniqueNumber()
  def deposit(account:Double) {balance += account}

  def getLastNumber = Account.lastNumber //访问伴生对象的私有属性
}
object Account {
  var lastNumber = 0
  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }
  def getBalance = new Account().balance//访问类中的私有属性
}
object _01_伴生对象 extends App{
  println(Account.lastNumber)

  println(Account.getBalance)
  println(new Account().getLastNumber)

}
