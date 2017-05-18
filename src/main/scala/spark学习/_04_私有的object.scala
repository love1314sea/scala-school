package spark学习

/**
  * Created by wushang on 16/5/7.
  */
object _04_私有的object {
  def main(args: Array[String]) {
    print(Util.p)
    print(Util.sum(4,5))
  }
}
//不是private
object Util {
  val p = 5;
  def sum( a :Int, b : Int) = {
    a+b
  }
}