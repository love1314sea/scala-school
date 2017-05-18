import scala.collection.mutable

/*
def find(p: (A) ⇒ Boolean): Option[A]
Finds the first element of the list satisfying a predicate, if any.
 */
val list = List(1,2,3)
list.find(p => p >= 3 || p < 0).foreach {p =>println(p)}

println(list.length)
println(list.size)

val hash = new mutable.HashMap[Int,String]
hash(1) = "a"
hash(2) = "b"
