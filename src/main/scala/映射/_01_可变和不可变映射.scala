package 映射

/**
 * Created by wushang on 15/9/29.
 */
object _01_可变和不可变映射 extends App{
  val map1 = Map("a"->1, "b"->2)
//  map1 += ("c" ->3)
//  map1.
//
  val map2 = scala.collection.mutable.Map("a"->1, "b"->2)
  map2("a") = 5
  map2 += ("c" ->3)

  println(map2.get("a"));
  println(map2.getOrElse("a",3))

}
