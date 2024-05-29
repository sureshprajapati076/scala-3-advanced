package com.rockthejvm.sp04440

import scala.annotation.tailrec

object RecursiionPractice extends App {

  // TAIL RECURSION USE GARA FOR ANY LOOP

  @tailrec
  def repeateNTimes(name: String, n : Int, accumulator: String): String ={
    if(n==0) accumulator
    else repeateNTimes(name,n-1,name+accumulator)
  }

  println(repeateNTimes("Suresh ",4,""))

}
