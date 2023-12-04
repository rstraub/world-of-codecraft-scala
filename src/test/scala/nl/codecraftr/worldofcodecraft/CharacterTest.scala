package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.Level.ONE
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CharacterTest extends AnyFlatSpec with Matchers {
  "character" should "be created with level 1" in {
    val character = Character(Name("Raxxer"))

    character.level shouldBe ONE
  }
}
