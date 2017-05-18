package _21_隐式转换._04_上下文界定

/*
T:M :上下文界定，要求作用域中存在一个类型为M[T]的隐式值。
              该隐式值可以被用在该类的方法中。

*/

// 1:当T为Int时，由于Predef作用域中有一个类型为Ordering[T]的隐式值，因此Int满足上下文界定。
// 2:这个Ordering[Int]就成为该类的一个字段，被传入需要该值的方法当中。
class Pair[T : Ordering ](val first:T, val second:T) {
 def smaller(implicit ord:Ordering[T]) = //需要implicit，隐式参数
    if (ord.compare(first, second) <0 ) first else second
}
object _01_ extends App {
  val p1 = new Pair[Int](3,4)
  println(p1.smaller)
}
