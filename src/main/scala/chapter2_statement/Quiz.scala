package chapter2_statement

object Quiz {
  def getMultipleByIteration(str: String, value: Long): Long = {
    if(str.length <= 0){
      value
    } else {
      str(0) * getMultipleByIteration(str.drop(1), value)
    }
  }


  def getMultipleWithoutLoop(str: String): Long = str.foldLeft(1L)((result, char) => result * char)

  def getMultiple(str: String): Long = {
    var result = 1L
    for (i <- str.toCharArray) {
      result *= i.toLong
    }
    result
  }

  def getNumberValue(number: Int): Int = {
    if (number > 0) {
      1
    } else if (number == 0) {
      0
    } else {
      -1
    }
  }
}
