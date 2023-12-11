package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.{aCharacter, otherCharacter}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CombatSpec extends AnyFlatSpec with Matchers {
  "attack" should "reduce HP of defender" in {
    val defender = Combat.attack(aCharacter, otherCharacter)

    defender.hp shouldBe HP(1000 - 200)
  }

  it should "not damage self" in {
    val defender = Combat.attack(aCharacter, aCharacter)

    defender.hp shouldBe HP(1000)
  }
}
