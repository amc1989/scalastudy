package com.securitystack.scala

/**
  * Created by zhulei on 2017/4/20.
  */
class chapter3 {

}

object chapter3{
  def main(args: Array[String]): Unit = {

    val list = List(1,23)

    val jstSet = Set("beijing","nanjing")
    println(jstSet)
    val js = jstSet+"shanghai"
    println(js)
    jstSet.foreach(a=>println(a))
  }
}
