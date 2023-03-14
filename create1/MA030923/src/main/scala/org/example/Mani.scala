package org.example
import one._

/**import org.example1.two*/
/**
 * Hello world!
 *
 */
object App{

  def main(args : Array[String]): Unit = {

    val x = 10
    val y = 20
    val a = 30
    val b = 20
    val sumof = sum(x, y)
    val mulof = sum(a, b)
    println("The summmation of " + x + " and " + y + " is " + sumof)
    println("The multiplication of " + x + " and " + y + " is " + mulof)
    val m = new two()
    val result = m.sub(x,y)
    println("The submission of " + x + " and " + y + " is " + result)






  }
}
