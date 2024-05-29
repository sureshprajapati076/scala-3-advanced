package com.rockthejvm.sp04440

object DefaultArgs extends App {

  def sayHello(name: String="Default Name", age: Int=5):Unit={
    println(f"This is $name%s and age is $age%d")
   // println(s"This is $name and age is $age")
  }

  sayHello();

  sayHello("Cat");

 // sayHello(5);

  sayHello(age = 4)

  sayHello(age=4, name = "TEST")

}
