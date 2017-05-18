//immutable set中，也有 - --(对List） + ++(对list） 运算，但是
// 不会对原来的set带来硬性，而是返回一个新的set，因此不会有 -= += 运算

val set_1 = Set(1,2,3,1,2,"hello")//元素类型是Any
set_1.foreach(println) // set 只保存一份，没有重复项

set_1 - 1
set_1.foreach(println) //内容不变

set_1 - (1,2) //减tuple
set_1 - List(1,"hello") //-,减的是List的对象
set_1 -- List(1,"hello") // --,减的是List里面的内容

set_1 + 4
set_1 + List(5,6) //+,加的是List的对象
set_1 ++ List(7,8)
set_1 + (9,10)

