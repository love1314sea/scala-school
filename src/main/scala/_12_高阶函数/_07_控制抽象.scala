package _12_高阶函数

object _07_控制抽象 extends App{
  def runInThread(block:() =>Unit) {
    new Thread {
      override def run() {block()} //新建一个线程，执行参数中的block函数
    }.start()
  }
  //将一系列语句组成不带参数也没有返回值的函数
  runInThread{()=>println("hi");Thread.sleep(3000);println("Bye")}

  println("--------------------------")
  //以上示例，调用函数时，需要写()=>，臃肿

  def runInThread2( block: =>Unit) {//1 把block后的参数()去掉
    new Thread {
      override def run(){ block }//2 去掉()
    }.start()
  }
  //3 调用时不再写()=> ，
  // 这是换名调用表示法：在参数声明和调用该函数参数的地方省略(),但保留 =>,
  runInThread2{ println("hi"); Thread.sleep(3000);println("Bye") }
}
