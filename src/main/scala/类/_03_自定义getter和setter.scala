package 类

/**
 * Created by wushang on 15/10/8.
 */
object _03_自定义getter和setter {

  class Person {
    private var privateAge = 0;
    def age = privateAge
    def age_(newValue:Int) = {
      if(newValue > privateAge)
        privateAge = newValue
    }
  }
  def main(args: Array[String]): Unit = {
    val fred = new Person
    fred.age_(30)
    println(fred.age)
  }
}
