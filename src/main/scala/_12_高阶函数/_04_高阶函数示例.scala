package _12_高阶函数

object _04_高阶函数示例 extends App{
  (1 to 9).map("*" * _).foreach(println)
  (1 to 9).map("a" * _).foreach(println)

  //filter用来过滤
  (1 to 9).filter( _ % 2 == 0 ).foreach(println)
  (1 to 9).reduceLeft(_ * _)

  // sortWith: 参数是一个匿名函数，来排序
  "Mary has a little lamb".split(" ").sortWith( _.length < _.length).foreach(println)
}
