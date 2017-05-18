package 类

/**
 * Created by wushang on 15/10/8.
 */

object _04_主构造器 {
  class Person(val name:String,  val age :Int) {
    println("just constructed another person")
    def description = name + " is age:" + age
  }
  def main(args : Array[String]) = {
    val p1 = new Person("zhangsan", 20)
  }
}
