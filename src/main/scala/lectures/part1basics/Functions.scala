package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("My number is:", 42))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))


  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  aFunctionWithSideEffects("This is the side effect")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  def aGreetingFunction(name: String, age: Int): Unit = {
    println(s"Hi, my name is $name and I am $age years old.")
  }

  aGreetingFunction("Mike", 45)

  def factiorialFunction(n: Int): Int = {
    if (n <= 0) n
    else n * factiorialFunction(n -1)
  }

  println(factiorialFunction(5)) // should be 120

  def fibonacciFunction(n: Int): Int = {
    if (n <= 2) 1
    else fibonacciFunction(n -1) + fibonacciFunction(n - 2)
  }

  println(fibonacciFunction(8)) // should be 21

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)


    isPrimeUntil(n/2)
  }

  println(isPrime(13)) // should be true
  println(isPrime(2003)) // should be true
  println(isPrime(13 * 27)) // should be false




}
