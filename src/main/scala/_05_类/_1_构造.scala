package _05_类

//使用var的变量 ,则会生成get、set两个函数
//使用val的变量，只有生成get函数
class Person1 {
  var name: String = _ //如果使用val，编译不报错，但执行报错
  var age : Int = 18
  private[this] var sex = "male"  //类外无法访问
}
//后面的参数实际是它的主构造函数
// 如果参数前未指明val或var， 则是private[this]类型
class Person2(val name:String, var age: Int, sex:String = "female") {
  println("i am class Person2") // 主构造器执行时，逐行执行类中的代码
  age = 15 // age 构造后，又重新赋值
}

//附属构造器名称是this
//附属构造器内第一行需调用已存在的主构造器或附属构造器
//附属构造器完成了构造器的重载
class Person3(val name:String, val age:Int ) {
  var sex:String = _
  def this( name:String, age:Int, sex:String ) {
    this(name,age) //
    this.sex = "male" //不要忘记前面的this
  }
}

object _1_base {
  def main(args: Array[String]) {
    val p1 = new Person1
    p1.name = "wu"   //为类中成员变量赋值
    p1.age = 12     // 重新赋值
    println(p1.name + ":" + p1.age)

    val p2 = new Person2("liu",16)
    println(p2.name + ":" + p2.age )

    val p3 = new Person3("zhang", 20, "male")
  }
}
