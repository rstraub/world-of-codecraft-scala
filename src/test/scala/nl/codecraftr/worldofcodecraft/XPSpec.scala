package nl.codecraftr.worldofcodecraft

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class XPSpec
    extends AnyFlatSpec
    with Matchers
    with TableDrivenPropertyChecks
    with ScalaCheckDrivenPropertyChecks {
  "XP" should "not be negative" in {
    an[IllegalArgumentException] should be thrownBy XP(-1)
  }

  it should "translate to levels" in {
    val cases = Table(
      "XP" -> "Level",
      0 -> 1,
      999 -> 1,
      1000 -> 2,
      2500 -> 3,
      3750 -> 4,
      5625 -> 5,
      8438 -> 6,
      12656 -> 7,
      18984 -> 8,
      28477 -> 9,
      42715 -> 10
    )

    forAll(cases) { (xp: Int, level: Int) =>
      XP(xp).level shouldBe Level(level)
    }
  }

  it should "be capped to level 10 regardless of XP" in {
    forAll { (xp: Int) =>
      whenever(xp >= 42715) {
        XP(xp).level shouldBe Level(10)
      }
    }
  }
}
