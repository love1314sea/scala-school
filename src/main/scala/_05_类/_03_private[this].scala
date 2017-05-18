package _05_类

/*
private[this]的使用：对象私有化

 */
class Counter {
  private var value = 0
 // private[this] var value = 0
  def setValue(i:Int){value = i}
  def isLess(other:Counter) = {
    value < other.value //虽然value是私用的，但是在此处仍然可以调用，因为other也是Counter对象，其实调用的是get方法
  }  //如果value用private[this]修饰，则不能调用，没有了get、set方法
}

object _3 extends App {
  val c1 = new Counter
  c1.setValue(4)
  val c2 = new Counter
  c2.setValue(5)
  println(c1.isLess(c2))
}
