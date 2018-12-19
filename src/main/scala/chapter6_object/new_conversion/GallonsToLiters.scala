package chapter6_object.new_conversion

object GallonsToLiters extends ConversionsBase {
  override def convert(src: Double): Double = src * 4.5460919
}
