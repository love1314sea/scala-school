package _10_特质

/*
特质中可以有函数的实现，
也可以有具体的字段，但这些字段不是被继承的，而是简单加入到了子类中。
 */
trait consoleLogger {
  def log(msg:String) { //trait中有默认实现，这是与java接口、抽象类不同的地方
    println(msg)
  }
}
class SaveAccount extends consoleLogger {
  def withdraw(amount:Int) {
    if(amount  > 0) log("ok")//子类中调用trait中实现的函数，我们称为“混入”
    else
      log("wrong")
  }
  //重写有默认实现的特质的函数，需要使用override
 // override def log(msg:String ) {println("saveAccount's function")}
}
object _02_特质可以有实现 extends App{
  val con1 = new SaveAccount
  con1.withdraw(4)
}
