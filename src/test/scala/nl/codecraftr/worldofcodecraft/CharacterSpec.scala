package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.aCharacter
import nl.codecraftr.worldofcodecraft.HP.{INITIAL, ZERO}
import nl.codecraftr.worldofcodecraft.Level.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CharacterSpec extends AnyFlatSpec with Matchers {
  "character" should "start at level 1" in {
    aCharacter.level shouldBe ONE
  }

  it should "start at 1000HP" in {
    aCharacter.hp shouldBe HP(1000)
  }

  "isAlive" should "be true given HP exceeds 0" in {
    aCharacter.isAlive shouldBe true
  }

  it should "be false given HP hits 0" in {
    aCharacter.copy(hp = HP(0)).isAlive shouldBe false
  }

  "hit" should "reduce HP by given points" in {
    val result = aCharacter.hit(1)

    result.hp shouldBe INITIAL - 1
  }

  it should "not reduce HP below 0" in {
    val result = aCharacter.hit(INITIAL.value + 1)

    result.hp shouldBe ZERO
  }

  "gainXP" should "increase XP by given points" in {
    val result = aCharacter.gain(XP(500))

    result.xp shouldBe XP(500)
  }

  it should "result in the character levelling up" in {
    val result = aCharacter.gain(XP(1000))

    result.level shouldBe Level(2)
  }
}

object CharacterSpec {
  val aCharacter: Character = Character(Name("Raxxer"))
  val otherCharacter: Character = Character(Name("Leeroy"))
}
