package _06_对象

object Breed extends Enumeration {
  val doberman = Value("Doberman Prinscher")
  val yorkie = Value("Yorkshire Terrier")

  val Red,Yellow,Green = Value // 集体定义，集体赋默认值

  val Black = Value(10,"Stop") //赋值为stop， id为10
  val Black2 = Value(15)
  val Black3 = Value("Go")
}
import Breed._  // 注意引入上面定义的对象

object _03_枚举 extends App {

  println(Breed.doberman + ":" + Breed.doberman.id )
  println(Breed.yorkie + ":" + Breed.yorkie.id )
  println(Breed.Red + ":" + Breed.Red.id )
  println(Breed.Yellow + ":" + Breed.Yellow.id )
  println(Breed.Green + ":" + Breed.Green.id )

  println(Breed.Black + ":" + Breed.Black.id )
  println(Breed.Black2 + ":" + Breed.Black2.id )
  println(Breed.Black3 + ":" + Breed.Black3.id )
}
