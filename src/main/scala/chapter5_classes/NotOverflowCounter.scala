package chapter5_classes

class NotOverflowCounter {
  private var currentValue: Int = 0

  def increase():Unit = {
    if(this.currentValue == Int.MaxValue){
      this.currentValue = 0;
    } else {
      this.currentValue += 1
    }
  }

  def current: Int = this.currentValue
}
