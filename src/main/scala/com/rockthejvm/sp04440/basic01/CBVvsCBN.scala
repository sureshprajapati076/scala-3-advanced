package com.rockthejvm.sp04440

object CBVvsCBN extends App {


  def callByValue(x:Long): Unit={
    println("by value: "+ x)
    println("by value: "+ x)
  }

  def callByName(x: => Long): Unit = {
    println("by Name: "+x)
    println("by Name: "+x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())


  def infinite(): Int = 1+infinite()
  def printFirst(x: Int, y: =>Int): Unit = println(x)

  
  
 // printFirst(infinite(),1)

  printFirst(1,infinite())


}
