package chapter4_map_tuple

object Quiz {
  def countWord(content: String): scala.collection.mutable.Map[String, Int] = {
    val strings = content.split(" ")
    val result = scala.collection.mutable.Map[String, Int]()

    for(word <- strings) {
      if(result.contains(word)){
        result(word) += 1
      } else {
        result(word) = 1
      }
    }

    result
  }

}
