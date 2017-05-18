package _14_模式匹配

object _02_match匹配类型 extends App {
  //1 类型匹配:注意 1 obj必须是Any类型，不能是具体类型 2 类型前必须给一个变量名
  def typ(obj:Any) = {
    obj match {
      case x: Int => x
      case s: String => Integer.parseInt(s)
      case m: Map[_,_] => { println("map") } //匹配发生在运行期，jvm中的泛型的类型信息是被擦掉的。
          //不要匹配具体的类型。如 map[String,Int]
      case a:Array[Int] =>println("array int")  //对于数组类型信息是完好的
      case b:Array[String] => println("array string" )
      case _: BigInt => Int.MaxValue // 匹配任何类型为BigInt的对象
      case BigInt => -1  //没有给变量，匹配类型为class的BigInt对象
      case _ => 0
    }
  }
  println(Int.MaxValue)
  println(typ("666"))
  val a = Array(1,2,3)
  typ(a)
  val b = Array("1","2","3")
  typ(b)

}
