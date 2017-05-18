
val map1 = Map(1->2,3->4)
if(map1(1) == 2)//返回值是Int
  println("yes1")
else
  println("no1")

map1.get(10)// Option[Int] = Some(2)
if(map1.get(1) == 2 )//返回值不是Int
  println("yes2")
else
  println("no2")

map1.get(1).get
//map1.get(4).get //不存在会抛出异常
map1.get(4).getOrElse(0)

map1.get(1).getOrElse(0)*2
if(map1.get(4).isDefined)
  map1.get(4).get * 2
else
  0

val res = map1.get(1) match {
  case Some(n) => n*2
  case None => 0
}
//还能这样打印,map后成了tuple
map1.map( line => println(line._1 + ":" + line._2))
