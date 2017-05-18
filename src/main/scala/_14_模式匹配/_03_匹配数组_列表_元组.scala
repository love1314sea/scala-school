package _14_模式匹配

// Array[Any] 并不包括 Array[Int], 它们是不同的类型，Any要求里面至少包括两种类型

object _03_匹配数组_列表_元组 extends App{

  def mt(arr:Array[Int]) = arr match {
    case Array(0) => "0" //(Array(0)的数组
    case Array(0,1) => "0 and 1"  //Array(0,1)
    case Array(x, y) => x +":" +y //Array(1,0) 两个元素的数组
    case Array(0, _*) => "0 ..." // 任何以0开始的数组
    case _  => "something else"
  }
  println( mt(Array(0)))
  println( mt(Array(0,0)))
  println( mt(Array(0,1)))
  println( mt(Array(1,0)))
  println( mt(Array(2,1,1,0)))

  println("---------------------")
  def mt2(list:List[Int]) = list match {
    case 0::Nil => "0"
    case x::y::Nil => x + ":" + y
    case 0::tail => "0..."
    case _ => "something else"
  }
  println(mt2(List(0)))
  println(mt2(List(3,4)))
  println(mt2(List(0,2,3)))
  println(mt2(List(4,5,6)))

  println("------------------------")

  //def mt2(tuple:)

}
