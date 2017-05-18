package _08_继承

/*
疑问：为什么转换过来，还是student2_1的对象？？？
 */
class Person2_1(name:String ) {
  def hello = { println("hello")}
}
class student2_1(name:String) extends Person2_1(name:String) {
  override def hello = { println("world") }
}
class Dog2 {

}
object _02_isInstanceOf extends App{
  val p1 = new Person2_1("wu")
  p1.hello
  val s1 = new student2_1("zhang")
  s1.hello
  if( s1.isInstanceOf[Person2_1]) {//子类对象是父类的实例
    println("yes Person2_1")
    val s2 = s1.asInstanceOf[Person2_1]//为什么转换过来，还是student2_1的对象？？？
    s2.hello
    println(s1.getClass)
    println(s1.getClass == classOf[student2_1])
    println(s2.getClass)
    println(s1.getClass == classOf[Person2_1])

  }

  if(p1.isInstanceOf[student2_1]) {//父类对象不是子类的实例
    println("yes student2_1")
  }else {
    println("no student2_1")
  }
  println("3------------------------")

  if(s1.isInstanceOf[Dog2]) {
    println("yes Dog2")
  }else {
    println("no Dog2")
  }
}
