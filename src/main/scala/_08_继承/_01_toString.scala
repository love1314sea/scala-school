package _08_继承

class Person1(name:String ) {

}
class Person2(name:String ) {
  override def toString = name //重写了 toString 方法
}
object _01_toString extends App {
  val p1 = new Person1("wu")
  println(p1.toString)

  val p2 = new Person2("wu")
  println(p2.toString)
}
