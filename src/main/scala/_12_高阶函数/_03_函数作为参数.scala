package _12_高阶函数

object _03_函数作为参数 extends App {

  def getFirst[T](a:Iterator[T]) = {
    a.next()
  }

  def test2[T,U](iter:Iterator[T],func:Iterator[T]=>U): Unit = {
    val gg = func(iter) //参数是Iterator[T]类型
    println(gg)
  }
  val iter = Iterator(1,2,3)
  test2(iter,getFirst[Int]) //getFirs后面的[Int]不可省略，否则不能推断出类型

}
