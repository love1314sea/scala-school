package 类

/**
 * Created by wushang on 15/9/29.
 */
object _02_对象私有字段 {
  class Counter {
    private var value = 0

    def increament() { value += 1}
    def isLess(other: Counter) = {
      value < other.value //能够访问value，因为other也同样是 Counter对象
    }
  }
  def main(args : Array[String]) = {
    val counter = new Counter
  }
}
