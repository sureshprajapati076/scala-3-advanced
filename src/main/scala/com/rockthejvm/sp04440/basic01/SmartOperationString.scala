package com.rockthejvm.sp04440

object SmartOperationString extends App {


  val str: String = "Hello World string world class";

  println(str.charAt(3))
  println(str.split(" ").toList)

  str.split(" ").toList.foreach(x=>{
    println(x)
  })

  val name="suresh"
  val age = 34
  val greeting = s"Hello, hi $name $age"
  val greet2 = s"Hello, hi $name ${age+1}"
  val greet3 = raw"Hello, \nhi $name $age"
  println(greeting)
  println(greet2)
  println(greet3)

  val greet4 = "this is \n new line"

  println(raw"this is \n new line")
  println(greet4)


}
