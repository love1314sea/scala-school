package _12_高阶函数

object _08_控制抽象2 extends App{

  //函数的两个参数被柯里化了
  //表达式称为无参函数的函数体，而该函数被当做参数传递下去
  def until(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
      until(condition)(block)
    }
  }
  // 使用
  var x = 10
  until (x == 0) { x -= 1; println(x) }
}
