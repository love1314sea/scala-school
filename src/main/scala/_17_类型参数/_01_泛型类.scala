package _17_类型参数

/*
 类和特质可以带类型的参数。如Array, List都是scala定义的泛型类，可以也可以自己定义反省类
 泛型类：泛型T S,在类名后面用[ ]定义, 参数(构造函数)/类体中可以使用
  */

class Pair[T,S](val first:T, val second:S) {
  def say1(str:T) { println(str)} //使用类的类型参数
  def say2[H](str:H) { println(str)} //泛型函数，可以不是类已经定义的类型参数
}
object _01_泛型类 extends App {
   val p = new Pair[Int,Int](1,2)  //显示指定类型
   p.say1(2)
  p.say2("aa")

  val p2 = new Pair("hello", 3) // scala自动推导类型
}
