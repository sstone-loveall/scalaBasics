object CallBy {
  def something() = {
    println("Inside calling something")
    5 // return value
  }

  def callByValue(x: Int) = {
    println("call by value: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }

  callByValue(something())

  /***
    * We know it is call by name because of the => symbol
    */
  def callByName(x: => Int) = {
    println("call by name: ")
    println("x1 = " + x)
    println("x2 = " + x)
  }

  callByName(something())
}