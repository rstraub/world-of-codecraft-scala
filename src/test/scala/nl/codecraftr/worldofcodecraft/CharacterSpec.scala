package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.CharacterSpec.aCharacter
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
}

object CharacterSpec {
  val aCharacter: Character = Character(Name("Raxxer"))
  val otherCharacter: Character = Character(Name("Leeroy"))
}
