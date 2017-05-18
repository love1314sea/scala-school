package _21_隐式转换._02_隐式转换参数

case class Delimits( left:String, right:String )

object FrenchPunctuation {
  implicit val delims = Delimits("<<",">>") //定义在伴生对象中
}

object _03_引入隐式参数 extends App {
  def quote(what:String ) (implicit delims:Delimits) = {
    println(delims.left + what + delims.right )
  }
  import _21_隐式转换._02_隐式转换参数.FrenchPunctuation._ //引入隐式参数，到类的函数级别
  quote("hello")
}
