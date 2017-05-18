package _08_继承

class Person5(val name:String ) {

}

object _05_匿名子类 extends App{
  val alien = new Person5("wu") { //定义一个匿名子类，语法： new P(){}
    def greeting = "hello"
  }
  //匿名子类标记为 Person5{def greeting:String}类型
  def meet(p:Person5{def greeting:String} ) {println(p.name + " says: " + p.greeting)}

  println(alien.greeting )
  meet(alien)
}
