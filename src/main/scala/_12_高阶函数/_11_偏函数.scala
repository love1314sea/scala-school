package _12_高阶函数

//partial function

object _11_偏函数 extends App {
  def add(x:Int, y:Int, z:Int) = x + y + z

  val add_1 = add(1,2, _:Int) //给部分参数赋值，未确定的参数一定要指定类型，返回一个值函数
  println(add_1(3))
  println(add_1(4))

  val add_2 = add(1,_:Int, _:Int)
  println(add_2(2,3))
}
