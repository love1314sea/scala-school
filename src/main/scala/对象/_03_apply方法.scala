package 对象

/**
 * Created by wushang on 15/10/8.
 */
object _03_apply方法 {

  class Account(int: Int) {
    println("1------")
    var balance = int;

  }

  object Account {
    private var lastNumber = 2;

    def getBalance = lastNumber;

    def apply(init: Int) = {
      new Account(init)
    }
  }

  def main(args: Array[String]): Unit = {
    val acct = Account.apply(5)
    println(acct.balance)
  }
}
