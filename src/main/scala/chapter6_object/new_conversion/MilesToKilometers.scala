package chapter6_object.new_conversion

object MilesToKilometers extends ConversionsBase {
  override def convert(src: Double): Double = src * 1.609344
}
