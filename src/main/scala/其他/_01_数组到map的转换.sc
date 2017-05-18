
val str = "a,b,c"

val arr = str.split(",").map((_,1))

val map = arr.toMap

println(map.get("a").getOrElse(0))


