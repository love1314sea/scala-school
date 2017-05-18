
//匹配值
val times = 1
val res1 = times match{
  case 1 => "one"
  case 2 => "two"
  case _ => "some other numbers"
}

val mat1 = {
  x:Int =>x match {
    case 1 =>"one"
    case _ => "other"
  }
}
mat1(1)

val res2 = times match {
  case i if i==1 => "one"
  case i if i==2 => "two"
  case _ => "some other number"
}

//匹配类型
def bigger(o:Any):Any = {
  o match {
    case i:Int if i < 0 => i + 1
    case i:Int => i - 1
    case d:Double if d <0.0 => d -0.1
    case d:Double => d + 0.1
    case text:String => text + "sss"
  }
}
val res3 = bigger(3)
val res4 = bigger(3.0)
val res5 = bigger("hello ")

