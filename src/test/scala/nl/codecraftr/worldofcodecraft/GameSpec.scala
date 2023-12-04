package nl.codecraftr.worldofcodecraft

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GameSpec extends AnyFlatSpec with Matchers {
  "game" should "allow character creation with unique name" in {
    val character = Game.createCharacter(Name("Raxxer"))

    character shouldBe Some(Character(Name("Raxxer")))
  }

  it should "not allow a character with a duplicate name" in {
    Game.createCharacter(Name("Raxxer"))
    Game.createCharacter(Name("Raxxer")) shouldBe None
  }
}
