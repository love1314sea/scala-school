package _17_类型参数

// <%视图界定，包含了隐式转换
// int 使用 <: 运行报错，是因为scala Int类型并有实现Comparable。
// 而RichInt实现了Comparable[Int], 同时还有一个从Int到RichInt的隐式转换

class Pair_5 [T <% Comparable[T]](val first:T, val second:T) {
  def smaller = if(first.compareTo(second) < 0) first else second
}

object _05_视图界定 extends App{

   val p2 = new Pair_5[Int](2,3)  //使用 <%，不再报错
   println(p2.smaller)
}

