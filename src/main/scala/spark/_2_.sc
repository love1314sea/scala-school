
import scala.collection.mutable.HashMap
val setting = new HashMap[String,Int]()

val str="wu,zhang,zhao"
for( (k,v) <- str.split(",").map(line =>( line,1)) ) {
  setting(k) = v
}
