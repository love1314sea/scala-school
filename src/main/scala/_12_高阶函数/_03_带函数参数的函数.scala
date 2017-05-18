package _12_高阶函数

import scala.math._

// valueAtOneQuarter 的类型是：( (Double)=>Double )=>Double
// 参数是一个函数，f(g(x)), 被称为higher-order function
object _03_带函数参数的函数 extends App{
  //1 函数作为传递参数
  def valueAtOneQuarter(f:(Double)=>Double) = f(0.25)
  println(valueAtOneQuarter(ceil _))
  println(valueAtOneQuarter(sqrt _))

//2 函数作为返回值
//函数体是一个函数，传入一个参数，生成一个函数，即函数可以作为返回值
// mulBy的类型是：(Double) => ( (Double)=>Double )
  def mulBy(factor:Double) = (x:Double)=> factor * x
  val quintuple = mulBy(5) //生成一个新的函数
  val quintuple2 = mulBy(10)
  println(quintuple(3))
  println(quintuple2(3))

}
