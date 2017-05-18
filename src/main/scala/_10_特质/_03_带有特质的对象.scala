package _10_特质

/*
怎么使用混入对象的特质：
1 一个类混入了特质
2 子特质继承了父特质，并重写了函数
3
 */

class Account() {
  var balance:Double = 0
}
trait Logged{
  def log(msg:String){} //函数是有实现的，虽然是空的，子类或子特质重写要使用override
}
/*
//
class SavingsAccount extends Account with Logged {
  def withdraw(amount:Double) {
    if(amount > balance)
      log("Insufficient funds")
    else
      log("OK")
  }
}


trait ConsoleLogger extends Logged {
  override def log(msg:String){println(msg)}
}


object _03_带有特质的对象 extends App{
  //构造对象时，混入了该对象所具有的特质的子类型
  //在调用这个对象所具有的特质方法时，将会执行子类型的方法。
 val acct = new SavingsAccount with ConsoleLogger
 acct.withdraw(20)
}
*/