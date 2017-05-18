package _14_模式匹配

//这个示例并不明白那些函数是什么意思
object _01_match extends App{

  val a = '3'
  val b = 3
  if(Character.isDigit(a))// a是char类型
    println("hello")
  if(Character.isDigit(b))// b 不是char类型，是Int的，不能判定
    println("hello")

  //1 匹配字符
  val ch:Char = 'a'
  ch match {
    case 'a' => 1
    case 'b' => 2
    case _ => 0
  }
  //2 守卫，即后添加boolean条件
  val ch2  = '3'
  var sign = 0
  ch2 match {
    case '+' => sign = 1
    case '-' => sign = -1
    case _ if Character.isDigit(ch2) => { println(sign); sign = Character.digit(ch2, 10);println(sign)}
    case _ => {
      println("yes")
      sign = 0
    }
  }
}
