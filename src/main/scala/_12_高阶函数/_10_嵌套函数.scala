package _12_高阶函数

/*
嵌套函数：函数中再定义一个函数
好处：1 里面的函数能直接使用外面函数的变量
     2 里面的函数实现了private功能，只能在本函数中使用，而无须定义在外面了
 */

object _10_嵌套函数 extends App{

  def sum(x:Int, y:Int, z:Int) = {

    def add1(x:Int, y:Int)= {
      println("***" + z) //直接使用外面函数的变量
      x + y
    }
    add1(add1(x,y), z)
  }

  println(sum(1,2,3))
}
