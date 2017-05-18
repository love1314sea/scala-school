package 高阶函数

/**
 * Created by wushang on 15/10/8.
 */
object _01_做为值的函数 {
  def main(args:Array[String]): Unit = {
    def add(x:Int, y:Int) = {
      x+y
    }
    val num = add _
    println(num(3,4))

  }
}
