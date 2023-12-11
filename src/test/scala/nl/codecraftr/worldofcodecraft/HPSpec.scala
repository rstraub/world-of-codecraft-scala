package nl.codecraftr.worldofcodecraft

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class HPSpec extends AnyFlatSpec with Matchers {
  "hp" should "never be negative" in {
    assertThrows[IllegalArgumentException] {
      HP(-1)
    }
  }
}
