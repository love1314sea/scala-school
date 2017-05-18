package _02_控制结构和函数

//输出主要有：print   println printf
//输入主要有：readLine，输入确定类型：readInt、readDouble, readByte,readShort,....
object _03_输入和输出 extends App{
  //printf类似C，格式化输出
  printf("hello, %s, my age is %d\n", "wang", 21)

  val name = readLine("Your name: ")// readLine， 有一个参数作为提示字符串
  println(name)
  println("your age:")
  val age = readInt()
  println(age)
}
