package spark学习

/**
  * Created by wushang on 16/5/7.
  */
object _01_并发 {
  val lock = new Object;
  def main(args:Array[String]) :Unit = {
    lock.synchronized(
      println("yes")
    )
  }
}
