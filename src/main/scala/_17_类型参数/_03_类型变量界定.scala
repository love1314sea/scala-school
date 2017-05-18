package _17_类型参数

// <:指定上界   [T <: Comparable[T]] T 必须是 Comparable[T]的子类型
// 如：String是Comparable[String]的子类型，合法，为什么？？
//    File并没有实现Comparable[File]，不合法
class Pair_3 [T <: Comparable[T]](val first:T, val second:T) {
  def smaller = if(first.compareTo(second) < 0) first else second
}

object _03_类型变量界定 extends App{
  val p = new Pair_3[String]("hello","world")
  println(p.smaller)

//  val p2 = new Pair_3[Int](2,3)  //编译不报错，运行报错。使用RichInt
}
