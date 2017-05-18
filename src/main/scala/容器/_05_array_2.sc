import scala.collection.mutable.ArrayBuffer

//参考网址：http://zhangjunhd.github.io/2013/12/18/scala-note3-array.html
/*
1 变长数组和定长数组都可以用排序函数
 */
val b = ArrayBuffer(10, 7, 2, 9)
b.sorted //不改变原来的数组, 从小到大
b.sortWith( _ > _)//不改变原数组，从大到小
println(b)
b.sortWith( _ < _) //不改变原数组，从小到大
println(b)
b.sortBy( _ > 4 ) // 不知道有什么用


val arr = Array(3,2,5)
arr.sorted.foreach(println)
//quickSort只能在定长中用
  scala.util.Sorting.quickSort(arr)
