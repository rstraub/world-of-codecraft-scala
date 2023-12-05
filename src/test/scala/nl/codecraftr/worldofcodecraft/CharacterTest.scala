package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.Level.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CharacterTest extends AnyFlatSpec with Matchers {
  private val aCharacter = Character(Name("Raxxer"))

  "character" should "start at level 1" in {
    aCharacter.level shouldBe ONE
  }

  it should "start at 1000HP" in {
    aCharacter.hp shouldBe HP(1000)
  }

  "isAlive" should "be true given HP exceeds 0" in {
    pending
  }

  it should "be false given HP hits 0" in {
    pending
  }
}
