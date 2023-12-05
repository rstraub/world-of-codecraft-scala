package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.{aCharacter, otherCharacter}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AttackSpec extends AnyFlatSpec with Matchers {
  "attack" should "reduce HP of defender" in {
    val defender = Attack(aCharacter, otherCharacter).execute

    defender.hp shouldBe HP(1000 - 200)
  }

  it should "not be allowed to attack self" in {
    assertThrows[IllegalArgumentException] {
      Attack(aCharacter, aCharacter).execute
    }
  }
}
