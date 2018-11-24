package chapter1_basic

import org.scalatest._

import scala.collection.immutable.Range
import scala.math._
import scala.math.BigInt._
import scala.util.Random

class Quiz extends FunSuite with DiagrammedAssertions {
  test("1 to ...") {
    assert(sqrt(3 * 3) == 3)

    assert((10 max 2) == 10)

    assert(BigInt(2).pow(1024) > Long.MaxValue)
    assert(2.pow(1024) > Long.MaxValue)

    val int = probablePrime(100, Random)
    assert(int.toString(36).length == 20) // why?

    val content = "asdfASDF"
    assert(content.take(2) == "as")
    assert(content.drop(2) == "dfASDF")
    assert(content.takeWhile(x => x != 'A') == "asdf")
  }
}
