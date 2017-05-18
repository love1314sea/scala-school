//--------创建可变长度的List----
import scala.collection.mutable.ListBuffer

val lb_1 = ListBuffer[Int]()
lb_1 += 1
lb_1 += (3,4,5) //加 tuple
lb_1 ++= List(7,8) //使用 ++=，加List

//可以用-去除元素
lb_1 -= 2
lb_1 -= 3
lb_1 -= (7,8)
lb_1 --= List(4,5)

lb_1.toList //转换成不可变的List
lb_1.toArray