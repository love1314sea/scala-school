package _05_类

class Person(val name:String, val age:Int) {
  val school = "qh"
  println("i am person")
}

//子类继承父类，主构造函数中父类中变量不用加val或var
//父类存在的函数或变量，子类要重写时，前面必须添加override

class Student( name:String, age:Int, val major:String) extends Person(name, age) {
  println("i am student:"+ major)
  override val school = "bj"
  override def toString = "to string...."
}
object _2_继承 {
  def main(args: Array[String]) {
    val s1 = new Student("zhang", 18, "shuxue")
    println(s1)
  }
}
