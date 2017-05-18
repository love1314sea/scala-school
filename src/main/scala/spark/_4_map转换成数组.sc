
val map1 = Map[String,Int]("wu"->1,"zhang"->2,"zhao"->3)

val arr1 = map1.toArray //转换成Array[(String, Int)]

val arr2:Seq[(String, Int)] = arr1.filter{ case (k,v) => k.startsWith("zh")}
               .map{ case (k,v) => (k,2) }
for((k,v) <- arr2 ) {
  println( k + ":" + v )
}
//Map也可以使用filter case 过滤,但不能转成Seq[(String, Int)]
val map2 = map1.filter{ case (k,v) => k.startsWith("zh")}
            .map{ case (k,v) => (k,2) }
for((k,v) <- map2 ) {
  println( k + ":" + v )
}