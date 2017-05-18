package _08_继承

class Person3{
  var name:String = "zhang"
  def id:Int =3
}
//一般的重写
class Student3_1 extends Person3 {
  override def id:Int = 5
 // override var name:String = "wu" //不能重写
}
// var只有是超类抽象字段才能重写
// 子类的val可以重写val字段，或者不带参数的def
class Student3_2(override val id:Int) extends Person3 {

}
object _03_重写字段 extends App{

}
