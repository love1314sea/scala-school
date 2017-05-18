package _17_类型参数

//Ordered[T] 后面的[T]不要忘记，Ordered想当于模板类，还不是具体的类
class Pair_6[T <% Ordered[T]](val first:T, val second:T) {
 // def smaller = if(first.compareTo(second) > 0) first else second

 def smaller = if(first > second ) first else second //Ordered提供了关系操作符

//  def small = if (first - second > 0) first else second //错误，并没有提供 - 运算符

}
object _06_视图界定_Ordered extends App{
  val p = new Pair_6[Int](5,2)
  println(p.smaller)

  val p2 = new  Pair_6[String]("hello","world")
  println(p2.smaller)
}
