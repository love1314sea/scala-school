package _23_scala_util._01_Sorting

//使用 sorting 内置的 by on进行排序
import scala.util.Sorting

object _01_sorting_by_on extends App{
  val pairs = Array(("a", 5, 2), ("c", 3, 1), ("b", 1, 3))

  // sort by 2nd element
  Sorting.quickSort(pairs)(Ordering.by[(String,Int,Int),Int](_._2))
  // sort by the 3rd element, then 1st
  Sorting.quickSort(pairs)(Ordering[(Int,String)].on(x =>(x._3,x._1)))
}
