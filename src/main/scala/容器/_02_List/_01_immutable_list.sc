
//----------默认为是不可变的--------
val list_1 = List(1,2,3,4,5)
val list_2 = 6::7::8::9::10::Nil //使用Nil构造
list_1.head  //第一个元素
list_1.tail //除去第一个元素，仍然是List
// ::，在头部添加元素， ::后是List
val list_3 =  6 :: list_1 // 返回的是新的List，原来的不变

//添加list，使用 :::
val list_4 = list_1 :::  list_2





