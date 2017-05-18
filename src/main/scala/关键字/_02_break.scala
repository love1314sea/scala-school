package 关键字

/*
scala中怎么替换break和contine？？
*/
import scala.util.control.Breaks._
object _02_break extends App {
  val list = List("1","2.scala","3","4")
  
  //方法1----------------
  var i = 0 
  var foundIt = false //在循环中使用一个flag，达到break的目的
  while (i <  list.length && !foundIt) {
    println("foundIt="+foundIt)
    if (list(i).endsWith(".scala")) {
      foundIt = true
    }
    i = i + 1 
  }
  println("foundIt="+foundIt)
  println(i-1)

  //使用for循环代替while
  var idx = 0
  var fndIt = false
  for( k <- list if !fndIt) {
    println("***b:" + k)
    if(k.endsWith(".scala")) {
      fndIt = true
    }
    println("***e:" + k)
  }
  //方法2：--------
  def searchFrom(i: Int): Int =
    if (i >= list.length) -1
    else if (list(i).startsWith("-")) searchFrom(i + 1)  //使用递归，替换了continue，这样本次循环不再往下执行
    else if (list(i).endsWith(".scala")) i  //使用返回值达到break的目的
    else searchFrom(i + 1)

  val i2 = searchFrom(0)
  println(i2)

  //参考：http://outofmemory.cn/scala/control-statement-if-else-while-for
  println("3:break---------")
  var i3 = 0
  while (i3 <  list.length) {
    println("i3=" + i3)
    try {
      if (list(i3).endsWith(".scala")) {
        println("*********")
        break  //break并不是传统的跳出循环，而是抛出一个异常，中断程序的执行
      }
    }catch {
      case ex: Exception  => ex.printStackTrace()//Exception in thread "main" scala.util.control.BreakControl
    }
    i3 = i3 + 1
  }
  println("i3=" + i3)
}
