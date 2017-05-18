package _21_隐式转换._02_隐式转换参数

import scala.math.Fractional


object _04_函数参数可以是函数 extends App {

  // 主要和泛型结合使用        // 隐式转换函数：函数名为order
  def smaller[T](a:T, b:T)(implicit order:T => Ordered[T]) = {

    //if(order(a) < b) a else b  //显示调用函数 order
    if( a < b) a else b //隐式转换函数在作用域内，自动调用隐式转换函数
  }

  println(smaller(4,5)) //Predef对象对大量已知类型都定义了 T => Ordered[T]

  //隐式转换与类型变量界定进行对比
  def smaller2[T <: Ordered[T] ](a:T, b:T) = {

    //if(order(a) < b) a else b
    if( a < b) a else b //隐式转换函数在作用域内，自动调用隐式转换函数
  }
  println(smaller(4,5))
}
