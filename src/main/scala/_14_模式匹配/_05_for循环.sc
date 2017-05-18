
val map = Map("a"->"a1","b"->"b1","c"->"")
//遍历
for((k,v) <- map) {
  println("k=" + k)
  println("v=" + v)
}
//只打印v是空白的值
for((k,"") <- map) {
  println("k=" + k)
}

//for中加守卫，放在<-之后
for((k,v) <- map if v != "") {
    println("k=" + k)
  println("v=" + v)
}