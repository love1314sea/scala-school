package _12_高阶函数

object _06_柯里化 extends App{
  def mul(x:Int,y:Int) = x*y
  def mulOneAtATime(x:Int) = (y:Int) => x * y // currying
  def mulOneAtATime2(x:Int)(y:Int) = x *y   // 简写形式

  println(mulOneAtATime(5)(6))

  val fun1 = mulOneAtATime(4)  // 返回的是函数： (y:Int) => 4 * y
  println(fun1(3))

  val fun2 = mulOneAtATime2(3)_   //柯里化和偏函数结合，此时参数_不需要指定类型
  println(fun2(2))
}
