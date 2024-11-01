package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
    def factorial(n: Int): Int =
      if (n <= 1) 1
      else {
        val result = n * factorial(n - 1)
        return result
      }


    def anotherFactorial(n: Int): BigInt = {
      @tailrec
      def factHelper(x: Int, accumulator: BigInt): BigInt =
        if (x <= 1) accumulator
        else factHelper(x - 1, x * accumulator)

      factHelper(n, 1)
    }


    println(anotherFactorial(3000))



}
