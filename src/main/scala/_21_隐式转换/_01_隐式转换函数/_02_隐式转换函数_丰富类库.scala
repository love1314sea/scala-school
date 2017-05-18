package _21_隐式转换._01_隐式转换函数

import java.io.File

class RichFile(file:File) {
   def read = println("i read")
}

object _02_隐式转换函数_丰富类库 extends App {

   implicit def file2RichFile(file:File) = new RichFile(file)
   val f = new File("/aaa")

   f.read //会自动调用上面的转换函数
 }
