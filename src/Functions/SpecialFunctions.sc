object SpecialFunctions {
  println("Welcome to the Scala Worksheet")
  ((x: Int) => x + 1) (5)

  val f = (x: Int) => x + 1
  f(5)
  f.apply(3)

  //assign anon function to variable
  val doubler = (i: Int) => {
    i * 2
  }
  doubler(6)

  // method that takes a function
  def someOperation(f: (Int, Int) => Int) {
    println(f(5, 5))
  }

  val add = (x: Int, y: Int) => x + y
  someOperation(add)

  // method that returns a function
  def greeting() = (name: String) => {
    "Hello " + name
  }

  val g = greeting()
  g("Peggy")

  // closure example
  var y = 5
  val multiplier = (x: Int) => x * y
  multiplier(4)
}