package chapter4_map_tuple

import java.io.File
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
    val filePath = "src/test/scala/chapter4_map_tuple/input.txt"
    val in = new Scanner(new java.io.File(filePath))
    while(in.hasNext()){
      val oneLine = in.next()
      Quiz.countWord(oneLine)
    }

    val worldCounts = Quiz.getResult
    assert(worldCounts("Hello") == 2)
    assert(worldCounts("world") == 1)
  }

}
