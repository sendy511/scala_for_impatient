package chapter6_object

class Point private(val x: Int, val y: Int) {
}

object Point {
  def apply(x: Int, y: Int): Point = {
    new Point(x, y)
  }
}