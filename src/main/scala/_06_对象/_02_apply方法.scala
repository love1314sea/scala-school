package _06_对象

/*
1 伴生对象中的apply方法，可以不通过new获得类的对象
*/
class Person2( val name:String, age:Int) {
  def getAge=age
}
object Person2 {
  val name = "zhang"
  def apply() =  {//不能省略(),调用时候不要调用
    println("apply1****")
    new Person2(name, 6)
  }
  def apply(age:Int) =
  {
    println("apply2****")
    new Person2("wu",age)
  }
}
object _02_apply方法 extends App{
  val p1 = new Person2("wu",5)
  println(p1.name)

  val p2 = Person2(3) // 调用单例对象中有参数的apply方法，生成一个对象
  println(p2.getAge)
  println(p2.name)


  val p3 = Person2() // 调用无参数的apply方法，生成一个对象
  p3.name
  p3.getAge         // 能访问类中的方法
  val p4 = Person2  // 把单例对象赋值给p4,即p4就是单例对象本身
  p4.name
  //p4.getAge //不能访问类中的方法
}
