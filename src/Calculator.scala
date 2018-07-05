/***
  * Tutorial: convert Java calculator class into Scala
  */
object Calculator {

  def main(args : Array[String]){
    val x = 10
    val y = 5
    println(addition(x, y))
    println(quotient(x, y))
    println(times(x, y))
    println(minus(x, y))
  }

  /***
    *
    * alternatively could be written as:
    *  def addition(a:Int, b:Int) = a + b
    */
  def addition(a: Int, b : Int) : Int = {
    var sum : Int = 0
    sum = a + b
    return sum
  }

  /***
    *
    * alternatively could be written as
    *  def quotient(a:Int, b:Int) = if(b == 0) 0 else a / b
    */
  def quotient(a : Int, b : Int) : Int = {
    var total : Int = 0
    if (b == 0) return total
    total = a/b
    return total
  }

  def times(c : Int, d : Int) : Int = {
    var total = c * d
    return total
  }

  def minus(a : Int, b : Int) : Int = {
    var total = a - b
    return total
  }
}