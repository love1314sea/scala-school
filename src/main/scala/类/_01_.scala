package 类

/**
 * Created by wushang on 15/9/29.
 */
object _01_ {

  class Counter {
    var aa = 4
    private var value = 0;
    def increament() = {
      value += 1
    }
    def current = value

    def gvalue = value
    def value_(u: Int) = {
      value = u
    }
  }
  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increament()
    println(myCounter.current)

    myCounter.value_(4)
    println(myCounter.gvalue)
  }
}

