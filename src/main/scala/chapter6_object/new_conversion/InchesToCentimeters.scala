package chapter6_object.new_conversion

object InchesToCentimeters extends ConversionsBase {
  override def convert(src: Double): Double = src * 2.54
}
