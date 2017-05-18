package 容器操作函数

/*
1 reduce 中的参数是一个函数,这个函数的参数类型同 调用者List的类型相关
2 不只是spark rdd中有reduce. spark rdd其实也是一个数组，scala 中的数组和rdd中的数组是想通的，只是实现方式不一样。
 */

object _03_reduce extends App{
  val list = List(1,2,3,4)
  list.reduce( (x:Int,y:Int )=> x + y)
  list.reduce( (x,y )=> x + y)
  list.reduce( _ + _) // reduce的参数是一个函数，自定义
}
