package 对象

/**
 * Created by wushang on 15/10/8.
 */
object _01_test {

  var age = 14
  def sayHello = {
    println("hello")
  }

  def main(args : Array[String]): Unit = {
    Option(1,2,3).map(_.toString).getOrElse{throw new Exception("wrong")}
  }

}

