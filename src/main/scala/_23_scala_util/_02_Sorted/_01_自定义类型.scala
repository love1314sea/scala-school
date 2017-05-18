package _23_scala_util._02_Sorted

/*
比较：Sorting 和 Sorted
1 sorted和java中一样，自定义类型，继承自Ordered，实现自己的比较函数，compare，当比较时，会自动调用。
2 Sorting，自定义了一种比较方式，排序时显示指定比较方式

3 官方文档中：注意sorted的hashCode、equals 函数，暂时不明白什么意思。
 */

case class Person_ (name:String,age:Int) extends Ordered[Person_] {
  //注意compare 返回值是Int，不是 this.age > that.age
  def compare(that: Person_) = this.age - that.age //从小到大排序
}

object _01_自定义类型 extends App{
  val person = Array(Person_("bob", 30), Person_("ann", 32), Person_("carl", 19))
  scala.util.Sorting.quickSort(person)
  person.foreach(println)
}
