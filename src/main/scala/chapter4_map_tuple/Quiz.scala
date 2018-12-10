package chapter4_map_tuple

object Quiz {
  private var immutableResult = Map[String, Int]()
  def countWordByImmutable(word: String): Unit = {
    if(immutableResult.contains(word)) {
      immutableResult = immutableResult + (word -> (immutableResult(word) + 1))
    } else {
      immutableResult = immutableResult + (word -> 1)
    }
  }
  def getImmutableResult = immutableResult

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
