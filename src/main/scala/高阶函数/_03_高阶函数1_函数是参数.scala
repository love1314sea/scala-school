package 高阶函数

/**
 * Created by wushang on 15/10/8.
 */
object _03_高阶函数1_函数是参数 {
  def add(x:Int, y:Int) = {
    x+y
  }
  def muti(x:Int, y:Int) = {
    x*y
  }
  def high(f:(Int,Int) => Int) = f(2,3) //函数是传入的参数
  def main(args: Array[String]) = {
    println(high(add))
    println(high(muti))
  }

}
