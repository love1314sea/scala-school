package _08_继承

/*
1 自定义类重写equals方法：记得参数一定是Any类型
2 不管基本类型还是引用类型，都可调用 isInstance, asInstance方法，因为 都扩展自Any类型。
2 对于引用类型，完全可以使用 == ，它会先检查是否是null，然后调用equals方法
 */
class Person6(var name:String, var age:Int) {
  final override def equals(other:Any) = {
    println("I am equals")
    val that= other.asInstanceOf[Person6]
    if(that == null)
      false
    else
    //  name == that.name && age == that.age
      name == that.name

  }
//  final override def hashCode = 13*name.hashCode + 5*age.hashCode
}
object _06_对象相等性 extends App{
  val p1 = new Person6("wu",24)
  val p2 = new Person6("wu",25)
  println(p1 == p2)  // == 也调用equals 方法
  println(p1.equals(p2))

  val list1 = List(1,2,3)
  val list2 = List(1,2,3,4)
  println(list1 == list2) //使用 ==  适用
}
