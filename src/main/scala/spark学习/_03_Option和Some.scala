package spark学习

/**
  * Created by wushang on 16/5/7.
  */

//Option类被两个类继承:  Some None
object _03_Option和Some {
  def main(args: Array[String]): Unit = {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None
      println(a.get)
      println(b.getOrElse(3)) // 使用getOrElse 来避免异常
//      print(b.get)

      println(Option(None).orElse(Option(6)))
      println(Option(5).orElse(Option(6)))

  }
}
