package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.{aCharacter, otherCharacter}
import nl.codecraftr.worldofcodecraft.HP.INITIAL
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CombatSpec extends AnyFlatSpec with Matchers {
  "attack" should "reduce HP of defender" in {
    val (_, defender) = Combat.attack(aCharacter, otherCharacter)

    defender.hp shouldBe otherCharacter.hp - 200
  }

  it should "not damage self" in {
    val (_, defender) = Combat.attack(aCharacter, aCharacter)

    defender.hp shouldBe INITIAL
  }

  it should "net the attacker 500 XP if he kills the defender" in {
    val weakenedCharacter = otherCharacter.copy(hp = HP(1))
    val (attacker, _) = Combat.attack(aCharacter, weakenedCharacter)

    attacker.xp shouldBe XP(500)
  }

  // TODO make these table driven once there is a level -> XP mapping
  "attacker" should "deal 25% more dmg per level higher than the defender" in {
    val attacker = aCharacter.copy(xp = XP(1000))
    val defender = otherCharacter.copy(xp = XP(0))

    val (_, damagedDefender) = Combat.attack(attacker, defender)

    damagedDefender.hp shouldBe defender.hp - 250
  }

  it should "deal 25% less dmg per level lower than the defender" in {
    val attacker = aCharacter.copy(xp = XP(0))
    val defender = otherCharacter.copy(xp = XP(1000))

    val (_, damagedDefender) = Combat.attack(attacker, defender)

    damagedDefender.hp shouldBe defender.hp - 150
  }
}
