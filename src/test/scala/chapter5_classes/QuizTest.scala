package chapter5_classes

import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions {
  test("verify none-negative counter") {
    val counter = new NotOverflowCounter
    for(_ <- 1 to Int.MaxValue) {
      counter.increase()
    }
    counter.increase()

    assert(counter.current == 0)
  }

  test("verify student with JavaBean") {
    val student = new Student
    student.setName("test")
    student.id = 1L

    assert(student.name == "test")
    assert(student.id == 1L)
  }

}
