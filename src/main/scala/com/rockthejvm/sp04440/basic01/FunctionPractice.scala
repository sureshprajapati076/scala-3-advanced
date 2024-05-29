package com.rockthejvm.sp04440

object FunctionPractice extends App {

  def fun1(name: String, age: Int): String = {
    "OKAY " + name + " "+age
  }

  var result =fun1("Ssuresh",34)
  println(result)


  // Use recursion for looping never use while loop

  def repeateNTimes (name: String, times: Int): String = {
    if(times==1) name
    else name +  repeateNTimes(name,times-1)
  }

  println(repeateNTimes("Suresh ",5))


  def bigFunc(a: Int): Int = {
    def smallFunc(x: Int, y: Int): Int = x+y
    smallFunc(a,a+1)
  }

  println(bigFunc(5))


  def greet(name: String, age: Int): String = f"Hi, my name is $name%s and I am $age%d years old."

  println(greet("Suresh",44))



  def factorialFunction(n: Int): Int = {
    if(n==1) 1
    else n*factorialFunction(n-1)
  }
  println(factorialFunction(5))


  def fibonaci(n: Int): Int ={
    if(n<=2) 1
    else fibonaci(n-1)+fibonaci(n-2)
  }

  println(fibonaci(8))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int) : Boolean ={
      if(t<=1) true
      else n%t!=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(isPrime(60))




}
