
//option类型：可能存在也可能不存在的值

val color = Map[String,String]("yellow"->"1", "red"->"2", "black"->"3")

//1--Map中的get函数返回Option[T]类型
color.get("red") match {
  case Some(c) => println(c) //样例子类Some包含了某个值
  case None => println("no color") //样例对象None表示没有这个值
}

//2--可以使用isEmpty和get
val aaa = color.get("red")
if(aaa.isEmpty) println("no color")
else println(aaa.get) // Option get后成some或None，some也可以get

//3-- 可以使用 isDefined（和isEmpty正好相反) 和 get
val bbb = color.get("red")
if(!bbb.isDefined) println("no color")
else println(bbb.get)

//4-- 使用getOrElse
color.getOrElse("black","No color") //返回基本类型String
val color2 = Map[String,Int]("yellow"->1, "red"->2, "black"->3)
color2.getOrElse("yellow", 0) //返回基本类型Int



