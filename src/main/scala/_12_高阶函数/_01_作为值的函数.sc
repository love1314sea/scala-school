import scala.math._
val fun = ceil _
fun(3.14)

Array(3.13,2,1.42).map(ceil _)
Array(3.13,2,1.42).map(fun)

//函数作为一等公民，可以在变量中存放函数
//函数也可以作为函数的参数
//后面的 _意味着这是一个函数
def big(a:Int,b:Int) = if(a>b)a else b
val fun2 = big _  //后面的 _不能省略

fun2(3,4)
