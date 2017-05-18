package 对象

/**
 * Created by wushang on 15/10/8.
 */
/*
类和它的伴生对象可以相互访问私有特性。
 */
object _02_伴生对象 {

  class Account {
    private var balance = 1;
    Account.lastNumber
    Account.lastNumber
  }

  object Account {
    private var lastNumber = 2;

    def getBalance = lastNumber;
    new Account().balance
  }

  def main(args: Array[String]): Unit = {

  }
}
