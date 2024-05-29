package com.rockthejvm.sp04440

object ValuesVarialbe extends App {

  val x = 3
  println(x)

  var acond = if(x==3) 4 else 6

  println(acond)

  println((acond=3))

  val aCodeBlock = {
    val y=2
    val x=3
    if(x<y) "hello" else "4"
  }

  println(aCodeBlock)


}
