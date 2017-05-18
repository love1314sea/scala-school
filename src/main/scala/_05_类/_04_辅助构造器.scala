package _05_类

/*
1 辅助构造器必须先调用主构造器
 */
class Person4_1 {
  var name:String = _
  var age:Int = _
  def this(name:String) {
    this()
    this.name = name
  }
  def this(name:String,age:Int) {
    this()
    this.name = name
    this.age = age
  }
}
object _04_辅助构造器 extends App {
  val p1 = new Person4_1
  println(p1.name)
  val p2 = new Person4_1("a")
}
