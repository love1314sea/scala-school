package _05_类

/*
1 主构造函数中的参数：
  a 如果没有val或var修饰，则默认是val，且是私有的；有了修饰，则是pulic的
  b val只生成get， var生成get set
2 辅助构造函数，第一步就调用主构造函数，(但辅助构造函数不一定比主构造函数少）。
3 每构造一个对象，肯定会执行一边类体，因为肯定会调用到主构造函数。
4 可通过在主构造函数中使用默认参数的方式来避免过多的使用辅助构造函数
5 主构造器可以变为private，则必须通过辅助构造器来构造对象了。

 */
class Person5_1(var name:String, age:Int,  sex:String = "male") {
//  var sex:String = _
  println("begin*****")
}
object _05_主构造器 extends App{

  val p1 = new Person5_1("wu",2)
  println(p1.name)
  p1.name = "hh"
 // println(p1.age)
}
