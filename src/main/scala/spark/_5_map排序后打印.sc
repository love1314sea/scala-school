
//1 case 不一定非要同match一起用来匹配，在循环中自己单独也可以使用,可用于过滤

val map1 = Map[String,Int]( "zhang"->2, "wu"->1, "zhao"->3)
for((k,v) <- map1 ) {
  println( k + ":" + v )
}
map1.foreach {  case (k,v) =>
       if(k.startsWith("w") )
          println(k +":" + v)
       }
//合并成一个大字符打印
val str = map1.toArray.sorted.map{case(k,v)=> k + "=" + v }
                             .mkString("\n")
println(str)
//打印每个元素
map1.toArray.sorted.map{case(k,v)=> println(k+"="+v) }
