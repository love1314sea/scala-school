package 高阶函数

/**
 * Created by wushang on 15/10/8.
 */
object _03_高阶函数2_生成另外一个函数 {

  def add(x:Int, y:Int) = {
    x+y
  }

  def high(x:Int) = (y:Int) => x*y
  def main(args: Array[String]): Unit = {
    val fun1 = high(5)
    println(fun1(2))

    println(high(3)(4))
  }
}
