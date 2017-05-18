package _23_scala_util._01_Sorting

import scala.util.Sorting

case class Person(name:String,age:Int)
//自定义排序方式，继承trait Ordering，实现 compare函数
object AgeOrdering extends Ordering[Person] {
  def compare(a:Person, b:Person) = a.age compare b.age
}
object _02_自定义类型排序 extends App {
  val person = Array(Person("bob", 30), Person("ann", 32), Person("carl", 19))

  Sorting.quickSort(person)(AgeOrdering)

}
