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

  test("verify student with constructor which convert negative to zero") {
    val student = new Student(-1)
    assert(student.age == 0)
  }

  test("verify that car has four constructor") {
    val car1 = new Car("benz", "s200", 1998, "京A88888")
    val car2 = new Car("benz", "GLA", "京A6666")
    val car3 = new Car("BMW", "5Serial", 2017)
    val car4 = new Car("BMW", "X5")

    assert(car1.producer == "benz")
    assert(car2.model == "GLA")
    assert(car3.licenseNumber == "")
    assert(car4.modelYear == -1)
  }

}
