package com.securitystack.scala

/**
  * Created by zhulei on 2017/4/21.
  */



object dddd{
  def main(args: Array[String]): Unit = {
    symbolTst('ddddd)

    println("hello scala")
  }


  //符号字面量;Symbol
  def symbolTst(r:Symbol):Unit = {

    val a = 'sssss
    println(a.name)//sssss
    println(a.toString())//'sssss

  }
}

