package spark学习

import scala.collection.mutable

/**
  * Created by wushang on 16/5/9.
  */
object _06_HashMap {
  def main(args: Array[String]) {
    val map = new mutable.HashMap[Int, String]()
    println(map.get(5))

    println(map.getOrElseUpdate(5, "5"))
    println(map.get(5))
    println(map.getOrElse(5,"6"))
  }

}
