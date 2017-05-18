package _08_继承

/*
1 抽象类既可以有方法，也可以有字段,继承的子类必须要重写
2 抽象类的重写可以省略override
3 抽象类中的var变量可以重写
 */
abstract class Person4 {
  def id:Int
  var name:String
}
class Student4_1 extends Person4 {
  def id:Int = 3
  var name:String = "wu"
}
//可以在主构造函数中重写字段，var或val不能忽略，且必须同抽象父类中的字段类型一致
class Student4_2(val id:Int, var name:String)extends Person4 {

}
object _04_抽象类 extends App{

}
