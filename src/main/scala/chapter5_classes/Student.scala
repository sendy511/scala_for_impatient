package chapter5_classes

import scala.beans.BeanProperty

class Student () {
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
