package 继承

/**
 * Created by wushang on 15/10/12.
 */
object _1_重写字段 {

  class Person(val name:String) {
    val age = 14
    override def toString = getClass().getName + " [name=" + name +"]"//getClass的使用
  }

  class Student(codeName:String) extends Person(codeName) {
    override val name = "zhao"  //字段和方法重写，需要加override
    override val age =18
  }

  def main(args:Array[String]): Unit = {

    val person = new Person("zhang")
    println(person.toString)

    val student = new Student("li")
    println(student.toString)
  }

}
