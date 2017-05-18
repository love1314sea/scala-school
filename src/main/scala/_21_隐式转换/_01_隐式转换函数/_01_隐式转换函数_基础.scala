package _21_隐式转换._01_隐式转换函数

/*
1 隐式转换不要存在二义性
 */

object _01_隐式转换函数_基础 extends App {
   def say( msg:String ) = println(msg)
   say("hello")
   implicit def int2String(i:Int) = i.toString
   say(2) //自动调用上面的隐式转换函数，转换成String类型
 }
