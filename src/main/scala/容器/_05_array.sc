//定长数组和变长数组
/*
1 变长数组赋值时不能使用下标
2 变长数组能转换成定长数组
 */


val arr1 = new Array[Int](3)
arr1(0) = 3
arr1(1) = 2
arr1(2) = 31

arr1.sor
arr1.max
arr1.sum

import scala.collection.mutable.ArrayBuffer
val arr2 = new ArrayBuffer[Int]( )
//arr2(0) = 1 //IndexOutOfBoundsException
arr2 += 2
arr2 += 2
//与一个定长数组相加
arr2 += (3,4,5)
arr2.insert(0,0)
arr2 ++= Array(1,2,3)
//制定下标删除
arr2.remove(2)
//从下标2开始，删除3个元素
arr2.remove(2,3)
arr2 += 6

arr2.length
//转化成定长数组后，求和
println(arr2.toArray.sum)
println(arr2.toArray.max)
println(arr2.toArray.min)
arr2.toList
arr2 += (7,8,9,10)
arr2.trimEnd(2)
arr2.trimStart(2)
arr2 += 0
// 数组遍历
for(i <- 0 until arr2.length )//通过下标
  println( arr2(i) )
for(i <- arr2)
  println(i)
0 to 3
0 until 3

