package chapter2_statement

import scala.math.BigInt._
//import scala.math.BigDecimal._

object Quiz {
  def getPowerValue(x: Int, power: Int): Double = {
    if(power > 0 && power % 2 == 0) {
      x.pow(power).toDouble
    } else if (power > 0 && power % 2 == 1) {
      (x * x.pow(power - 1)).toDouble
    } else if (power == 0) {
      1.0
    } else if (power < 0) {
      1.0 / x.pow(-power).toDouble
    } else {
      throw new Exception("Unsupported value")
    }
  }

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
