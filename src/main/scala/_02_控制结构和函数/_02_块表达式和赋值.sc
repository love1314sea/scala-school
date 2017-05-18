// 同C/C++不一样，赋值语句的值是Unit，所以不能连续赋值
var x = 5
var y = 3
//x = y = 1 //不能连续赋值


//块表达式{} 同 if..else.. 一样，最后一个表达式的值就是块的值
val distance = { val dx = 4; val dy = 5; dx + dy}


//语句块中，最后一个表达式是赋值语句，其返回值是Unit，作为块的值
val z = { var r = x * y; r -= 1}