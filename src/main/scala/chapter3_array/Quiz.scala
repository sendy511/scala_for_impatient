package chapter3_array

import scala.collection.mutable.ArrayBuffer

object Quiz {
  def reverseOrder(data: Array[Int]) {
    var tmpData = 0
    for(i <- 0 until (data.length / 2)) {
      tmpData = data(i)
      val reverseIndex = data.length - i - 1
      data(i) = data(reverseIndex)
      data(reverseIndex) = tmpData
    }
  }

  def getAverage(data: Array[Int]): Double = {
    data.sum / data.length
  }

  def customOrder(data: Array[Int]): Array[Int] = {
    val b = ArrayBuffer[Int]()
    b ++= data.filter(x => x > 0)
    b ++= data.filter(x => x == 0)
    b ++= data.filter(x => x < 0)
    b.toArray
  }

  //  def exchangeNeighborElementWithNewArray(testData: Array[Int]): Array[Int] = {
//    for (i <- testData.indices) {
//      if (i % 2 == 0)
//        yield testData(i + 1)
//      } else {
//        yield testData(i - 1)
//      }
//    }
//  }

  def exchangeNeighborElement(array: Array[Int]) {
    var preValue: Int = 0;
    for(i <- array.indices) {

      if(i % 2 == 0){
        preValue = array(i)
      } else {
        array(i - 1) = array(i)
        array(i) = preValue
      }
    }
  }

  def generateArray(length: Int): Array[Int] = {
    val random = scala.util.Random
    val arrayLength: Int = random.nextInt(length)
    val a = new Array[Int](arrayLength)
    for(i <- a.indices) {
      a(i) = random.nextInt(length)
    }
    a
  }
}
