package _21_隐式转换._01_隐式转换函数

/*
1 隐式转换函数位于源或目标类型的伴生对象中，且要引入
2 在当前作用域中
 */
import java.io.File


class RichFile_2(file:File) {
   def read = println("i read")
 }

object RichFile_2 {
   implicit def file2RichFile_2(file:File) = new RichFile_2(file)
 }

object _03_隐式转换函数的引入 extends App {

  //implicit def file2RichFile(file:File) = new RichFile_2(file)
  val f = new File("/aaa")
  import _21_隐式转换._01_隐式转换函数.RichFile_2._ // 要引入到函数的级别

  f.read //会自动调用上面的转换函数
 }
