package _14_样例类

/*
样例类，会自动发生：
1 构造器中的每一个参数都为val-可以显式声明为var
2 在伴生对象中提供apply方法，不使用new关键字就能构造对象
3 提供unapply方法让模式匹配可以工作
4 将生成toString equals hashCode copy方法-除非显式的给出这些方法的定义
5 除了以上，样例类和其他类完全一样，可以添加字段和方法，扩展它们
 */
abstract class Amount
case class Dollar(value:Double) extends Amount
case class Currency(value:Double,unit:String)extends Amount
case object Nothing extends Amount  //针对单例的样例对象
object _01_样例类 extends App {

  def mat(obj:Any) = obj match {
    case Dollar(v) => "$"+ v
    case Currency(_,u) => "oh,noes,i got " + u
    case Nothing => ""  //单例的样例对象可以用于模式匹配
       //样例类的实例使用(),样例对象不使用()

  }
  println( mat(Currency(5,"yuan")) )
  println( mat(Dollar(5)) )
  println( mat(Nothing) )

  println("------------")
  def mat2(obj:Any) = obj match {
    case v:Dollar => "$"+ v
    case h:Currency => "oh,noes,i got "
 //   case n:Nothing =>  "nothing" //单例对象不能用于模式匹配
    case _ => "other"
  }
  println( mat2(Currency(5,"yuan")) )
  println( mat2(Dollar(5)) )
  println( mat2(Nothing) )

}
