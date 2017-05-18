package spark学习

/**
  * Created by wushang on 16/5/7.
  */
object _02_toSeq {
  def main(args: Array[String]): Unit = {
    val list = List("a:b:c", "d:e")
    val a = list.map(_.split(":")).toSeq //返回类型 Seq[Array[String]]
    val b = a.flatten // Seq[String] 多个数组转换成一个数组, 把里面的元素一个个提出来
    for( c <- b) {
      println(c)
    }
  }
}
