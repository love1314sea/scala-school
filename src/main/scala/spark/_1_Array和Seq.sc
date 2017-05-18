
val strs = Array("abc,def,hij","lmn,opq")
val t1 = strs.map(_.split(","))
val t2 = t1.map(_.filter(_.size != 0))// Array[Array[String]]

val t3 = t2.toSeq  //Array[Array[String]] => Seq[String]
val t4 = t3.flatten  //t4为Seq[String] 类型
t4.foreach( println )
val t5 = t2.flatten  //t5为Array[String]类型
t5.foreach( println )

// -----------
val a1 = Array(1, 2, 3)
val seq: Seq[Int] = a1 //Array-> Seq[Int]=WrappedArray
val seq2 = a1.toSeq  // Seq[Int] = WrappedArray(1, 2, 3)
val a2: Array[Int] = seq.toArray //Seq[Int] ->Array[Int]

//------------
val s = Seq(1, 1, 2) // Seq[Int] = List(1, 1, 2) 默认是List

s.zipWithIndex // 类型：由原来的Seq[Int]变为Seq[(Int,Int)]