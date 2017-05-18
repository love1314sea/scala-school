package _17_类型参数

// [R >: T] R是T的父类
case class Pair_4[T](val first:T, val second:T) {
  def replaceFirst(newFirst:T) = new Pair_4[T](newFirst,second )
  def replaceFirst_2[R >: T](newFirst:R) = new Pair_4[R](newFirst,second )
}
class Person{

}
class Student extends Person {

}
object _04_类型变量界定 extends App{
  val p1 = Pair_4(new Student(),new Student())

}
