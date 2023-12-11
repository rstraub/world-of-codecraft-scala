package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.{aCharacter, otherCharacter}
import nl.codecraftr.worldofcodecraft.HP.INITIAL
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CombatSpec extends AnyFlatSpec with Matchers {
  "attack" should "reduce HP of defender" in {
    val result = Combat.attack(aCharacter, otherCharacter)

    result.hp shouldBe otherCharacter.hp - 200
  }

  it should "not damage self" in {
    val result = Combat.attack(aCharacter, aCharacter)

    result.hp shouldBe INITIAL
  }
}
