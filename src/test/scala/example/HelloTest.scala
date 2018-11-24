package example

import org.scalatest._

class HelloTest extends FunSuite with DiagrammedAssertions {
	test("Say Hello") {
		HelloApp.say
		assert(true)
	}
}