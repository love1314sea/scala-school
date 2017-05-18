package _17_类型参数

//泛型函数：把类型参数放在方法名后面。 参数、函数体中可以使用
object _02_泛型函数 extends App{

  def getMiddle[T](arr:Array[T]) = arr(arr.length/2)

  println(getMiddle[String](Array("1","2","3"))) // 显示指定类型
  println(getMiddle(Array(1,2,3))) //省略类型信息，scala会自动推断
}
