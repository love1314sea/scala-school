package _21_隐式转换._03_隐式类

//1 隐式类中的类名是无所谓的


object _01_隐式类 extends App {
  implicit class Calculator2(x:Int){  //隐式类，类前面加 implicit
  def add(a:Int):Int = a + 1
  }
  println(1.add(1))  // 先找本身类型中有没有add函数，如果没有，看能否调用构造函数，把自己转换成
  //  隐式类的类型，然后调用类中的构造函数
}
