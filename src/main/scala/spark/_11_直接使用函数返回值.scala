package spark

object _11_直接使用函数返回值 extends App{
  def getList = List(1,2,3)
  getList.map(println(_)) //直接使用函数返回值
}
