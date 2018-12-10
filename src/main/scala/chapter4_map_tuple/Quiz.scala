package chapter4_map_tuple

object Quiz {
  private val result = scala.collection.mutable.Map[String, Int]()
  def countWord(word: String) = {
    if (result.contains(word)) {
      result(word) += 1
    } else {
      result(word) = 1
    }
  }

  def getResult = result
}
