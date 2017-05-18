package _12_高阶函数

/*
闭包是通过“捕获”自由变量的绑定对函数文本执行的“关闭”行动
 */
object _05_闭包 extends App{
  var more = 1
  //变量more在函数addMore的作用域外，但仍然可以调用

  def addMore(x:Int) =  x + more //more是自由变量
  val addMore2 = (x:Int) => x + more
  println(addMore(10))

  more = 20 //自由变量的值改变，addMore相应改变
  println(addMore(10))

  println("-----------------------")

  val someNumbers = List(1,2,3,4)
 // var sum = 0;
  var sum = 1
  someNumbers.foreach( sum += _)  //foreach中的匿名函数是一个闭包，sum 在作用域外定义
  println(sum)

  //上例中，函数作为返回值也是闭包的应用
}
