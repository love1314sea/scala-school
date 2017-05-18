package _21_隐式转换._02_隐式转换参数

case class Delimiters( left:String, right:String )
object _02_隐式参数 extends App{
  def quote(what:String)(implicit delims:Delimiters) = {
    println(delims.left + what + delims.right)
  }
  quote("hello")(Delimiters("<<",">>")) // 显示调用

  implicit val delims = Delimiters("&","$") //定义一个隐式参数,必须赋值给val或var变量
  quote("boy") //在当前作用域下找到隐式参数
}
