package 变长参数

/**
 * Created by wushang on 15/9/29.
 */
object _1 extends App{

  def sum(args: Int*) = {
    var result = 0
    for(arg <- args)
      result += arg
    result
  }

  println(sum(1,2,3))

  println(sum( 1 to 5 : _*)) //参数不能是一个整数区间，加_*, 把 1 to 5 当作参数序列处理
}
