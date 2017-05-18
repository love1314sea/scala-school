package _21_隐式转换._01_隐式转换函数

//1 使用隐式转换丰富现有类库的功能
//  a 增加一个新类，新类中定义新的函数，函数中调用旧类
//  b 增加一个implicit的函数，
class A {

 }

class RichA(a:A) {
   def rich(): Unit ={
     println("rich a...")
   }
 }

object _01_隐式转换函数 extends App{
   implicit def a2RichA(a:A) = {
     println("hello..")
     new RichA(a) //函数前加上关键字，但是并不需要调用，函数自动调用,只要参数类型相符
   }
   val a = new A
   a.rich()
 }
