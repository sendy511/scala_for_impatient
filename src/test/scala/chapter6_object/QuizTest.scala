package chapter6_object

import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions{
  test("verify conversions") {
    assert(Conversions.inchesToCentimeters(1) == 2.54)
    assert(Conversions.gallonsToLiters(1) == 4.5460919)
    assert(Conversions.milesToKilometers(1) == 1.609344)
  }
}
