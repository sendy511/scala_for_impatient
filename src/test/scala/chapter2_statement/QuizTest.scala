package chapter2_statement

import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions {
  test("should be 1,-1,0 when positive,negative,zero") {
    assert(Quiz.getNumberValue(100) == 1)
    assert(Quiz.getNumberValue(-100) == -1)
    assert(Quiz.getNumberValue(0) == 0)
  }

  test("should be easy loop") {
    for(i <- 1 to 10) println(10 - i)
  }

  test("should be able to multiple characters") {
    assert(Quiz.getMultiple("Hello") == 9415087488L)
  }

  test("should be able to multiple characters without loop") {
    assert(Quiz.getMultipleWithoutLoop("Hello") == 9415087488L)
  }

  test("should be able to multiple characters using iteration") {
    assert(Quiz.getMultipleByIteration("Hello", 1) == 9415087488L)
  }

  test("should be able to calculate x power n") {
    assert(Quiz.getPowerValue(10, 2) == 100)
    assert(Quiz.getPowerValue(10, 3) == 1000)
    assert(Quiz.getPowerValue(10, 0) == 1)
    assert(Quiz.getPowerValue(10, -2) == 0.01)
  }
}
