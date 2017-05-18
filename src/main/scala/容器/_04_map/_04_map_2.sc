
//默认为定义的map是不可变的,指key对应的value不能变
var  map = Map("jim"->1, "tom" -> 2)
//如果不存在，抛出异常 , 避免这种情况
//map("jj")
//使用getOrElse()代替
map.getOrElse("jj", 0)
map.get("jj")
map += ("tt"->4)
//使用+= 返回的是一个新的map，与val或var有关，与可变不可变无关

val map2 = scala.collection.mutable.Map[String,Int]()
//添加 元素
map2("aa") = 1
map2("aa") = 3
map2 += ("bb"->2, "cc"->3)
// 删除元素
map2 -= "aa"
//遍历
for((k,v) <- map2)
  println(k + ":" + v)

val keys = map2.keySet
val values = map2.values