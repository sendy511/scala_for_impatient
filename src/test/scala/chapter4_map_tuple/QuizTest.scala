package chapter4_map_tuple

import java.util.Scanner

import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions {

  test("should be able create map") {
    val productPrice = Map("hat" -> 10, "socket" -> 5, "underwear" -> 4)

    val discountedProduct = for((v,k) <- productPrice) yield (v, k * 0.8)

    assert(discountedProduct("hat") == 8)
    assert(discountedProduct("socket") == 4)
    assert(discountedProduct("underwear") == 3.2)
  }

  test("should be able to count words") {
    val in = new Scanner(new java.io.File("input.txt"))
    while(in.hasNext()){
      val oneLine = in.next()
      val stringToInt = Quiz.countWord(oneLine)
      assert(stringToInt("Hello") == 2)
      assert(stringToInt("world") == 1)
    }

  }

}
