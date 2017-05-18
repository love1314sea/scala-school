package 高阶函数

/**
 * Created by wushang on 15/10/8.
 */
object _04_柯里化 {
  def main(args: Array[String]): Unit = {
    def add1(x:Int, y:Int) = x+y
    def add2(x:Int)(y:Int) = x+y
    val add3 = add2(4)(5)
    println(add1(5,4))
//    println(add2(5,4))
//    println(add1(5)(4))
    println(add2(5)(4))

  }
}
