
val arr1 = Array(1,2,3)
val arr2 = Array(3,4,5)
val arr3 = Array.concat(arr1,arr2)
arr3.foreach(println)

/* List不能使用
val list1 = List(1,2,3)
val list2 = List(3,4,5)
val list3 = Array.concat(list1,list2)
list3.foreach(println)
*/