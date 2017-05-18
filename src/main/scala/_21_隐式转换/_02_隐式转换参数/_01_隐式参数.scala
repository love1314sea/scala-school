package _21_隐式转换._02_隐式转换参数

class A2 {

}
class RichA2(a:A2) {
  def rich(): Unit = {
    println("Rich a........")
  }
}
object _01_隐式参数 extends App {
 // 函数的隐式参数，即参数前面加上 implicit
  def testParam(implicit name:String ): Unit = {
    println(name)
  }
  implicit val name = "hhh"
 // implicit val name1 = "hhh"
  testParam  //不能有两个implicit参数，否则会报错
  testParam("ggg")//也可以显示指明参数

}
