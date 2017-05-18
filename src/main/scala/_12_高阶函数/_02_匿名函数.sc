
//把函数放在变量中
val triple = (x:Int) => 3*x
//使用def定义函数
def triple2(x:Int) = 3*x

//调用没有任何区别
triple(2)
triple2(2)

//map中的是匿名函数，同前面的比较
Array(1,2,3).map(x=>x*3)
Array(1,2,3).map( (x:Int) =>x*3 )
Array(1,2,3).map{ (x:Int) =>x*3 }

