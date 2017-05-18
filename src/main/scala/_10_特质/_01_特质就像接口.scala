package _10_特质

trait Logger {
  def log(msg:String)//特质中未被实现的方法默认为是抽象函数，不需要声明abstract
}
class ConsoleLogger extends Logger {
  def log(msg:String) {println(msg)} //实现trait的函数，可以不使用override
}
object _01_特质就像接口 extends App { //继承、实现抽象类、特质，第一个总使用 extends
  val c1 = new ConsoleLogger
  c1.log("hekki")
}

//1 必须实现trait中定义的抽象函数
//2 可以with任意个trait
//3 java接口都可以当做scala特质使用
class ConsoleLogger2 extends Logger with Cloneable with Serializable {
  def log(msg:String) {println(msg)}
}
