package chapter5_classes

import scala.beans.BeanProperty

class Student {
  var age: Int = 0

  def this(age: Int) {
    this()
    this.age = if (age < 0) 0 else age
  }

  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}

class Car(
  val producer: String,
  val model: String,
  val modelYear: Int,
  var licenseNumber: String) {
  def this(producer: String, model: String, modelYear: Int) {
    this(producer, model, modelYear, "")
  }

  def this(producer: String, model: String, licenseNumber: String) {
    this(producer, model, -1, licenseNumber)
  }

  def this(producer: String, model: String) {
    this(producer, model, -1, "")
  }
}
