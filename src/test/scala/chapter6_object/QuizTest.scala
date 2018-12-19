package chapter6_object

import chapter6_object.new_conversion.{GallonsToLiters, InchesToCentimeters, MilesToKilometers}
import org.scalatest.{DiagrammedAssertions, FunSuite}

class QuizTest extends FunSuite with DiagrammedAssertions{
  test("verify conversions") {
    assert(Conversions.inchesToCentimeters(1) == 2.54)
    assert(Conversions.gallonsToLiters(1) == 4.5460919)
    assert(Conversions.milesToKilometers(1) == 1.609344)
  }

  test("verify conversion with super class implementation") {
    assert(InchesToCentimeters.convert(1) == 2.54)
    assert(GallonsToLiters.convert(1) == 4.5460919)
    assert(MilesToKilometers.convert(1) == 1.609344)
  }

  test("verify point with apply") {
    val point = Point(10, 20)
    assert(point.x == 10)
    assert(point.y == 20)
  }
}
