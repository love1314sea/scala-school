package spark

object _07_foreach extends App {
  def addjar(path:String): Unit = {
 /*   if( path == null ) {
      println("empty")
    }
    else {*/
      path match {
        case "b.jar" | "a.jar" =>
          println("a.jar or b.jar")
          println(">>>")
        case null =>
          println("empty")
        case _ =>
          println("other")
      }
  }
  //val jars = "a.jar,b.jar,c.jar"
  val jars = ""// 与null区别开
  jars.split(",") foreach(addjar)

}
