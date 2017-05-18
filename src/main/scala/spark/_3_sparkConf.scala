package spark

import scala.collection.mutable
import scala.collection.JavaConverters._


class _3_sparkConf(loadDefaults: Boolean) {
  def this() = this(true)
  private val setting = new mutable.HashMap[String,String]()
  if(loadDefaults) {
    // System.getProperties.asScala 能够取得系统所有的运行环境 user.language:zh sun.desktop:windows
    // sun.cpu.isalist:amd64
    for((k,v)<- System.getProperties.asScala if k.startsWith("spark.")) {
      setting(k) = v
    }
  }
  //返回值：是自身的类，返回this
  def set(Key:String, Value:String ):_3_sparkConf  = {
    setting(Key) = Value
    this
  }
  def setMaster(master:String):_3_sparkConf = {
    set("spark.master", master)
  }
  def setAppName(name:String):_3_sparkConf = {
    set("spark.app.name", name)
  }

  def get(key:String):String = {
    setting.getOrElse(key,"1")
  }
  //这个
  def getOption(key:String):Option[String] = {
    setting.get(key)
  }
}
