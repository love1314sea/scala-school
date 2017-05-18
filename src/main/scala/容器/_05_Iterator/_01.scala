package 容器._05_Iterator

object _01 extends App{
  val iter = Iterator(1,2,3)// 定义一个Iterator,其地位和Array、List,是个容器，是数据结构
  if(iter.hasNext) {
    println(iter.next())
  }
  println("------------------")
  val iter2 = Iterator(1,2,3)
  while(iter2.hasNext) { //while遍历
    println(iter2.next)
  }

  iter.toArray //可以转换成数组


}
