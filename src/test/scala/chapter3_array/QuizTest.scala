package chapter3_array

import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions{
  test("should be able to get random array between 0 and n") {
    val array = Quiz.generateArray(10)
    println(array.mkString(" "))
    assert(array.length < 10)
    assert(array.forall(x => x < 10))
  }

  test("should be able to exchange the neighbor element") {
    val testData = Array(1, 2, 3, 4, 5)
    Quiz.exchangeNeighborElement(testData)
    assert(testData sameElements Array(2, 1, 4, 3, 5))
  }

//  test("should be able to generate new array with exchanging the neighbor element") {
//    val testData = Array(1, 2, 3, 4, 5)
//    val value = Quiz.exchangeNeighborElementWithNewArray(testData)
//    assert(value sameElements Array(2, 1, 4, 3, 5))
//  }

  test("should be able to get an custom order") {
    val data = Array(-5, 5, 1, 3, -1, -3, 0)
    val orderedData = Quiz.customOrder(data)
    assert(orderedData sameElements Array(5, 1, 3, 0, -5, -1, -3))
  }

  test("should be able to get average value") {
    val data = Array(-5, 5, 1, 3, -1, -3, 0)
    val average = Quiz.getAverage(data)
    assert(average == 0)
  }

  test("should be able to reverse an array") {
    val data = Array(-5, 5, 1, 3, -1, -3, 0)
    Quiz.reverseOrder(data)
    assert(data sameElements Array(0, -3, -1, 3, 1, 5, -5))
  }

  test("should be able to reverse an array with odd length") {
    val data = Array(-5, 5, 1, 3, -1, -3)
    Quiz.reverseOrder(data)
    assert(data sameElements Array(-3, -1, 3, 1, 5, -5))
  }
}
