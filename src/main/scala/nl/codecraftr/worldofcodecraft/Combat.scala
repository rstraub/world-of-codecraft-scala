package nl.codecraftr.worldofcodecraft

object Combat {
  private def BASE_DMG = 200

  def attack(
      attacker: Character,
      defender: Character
  ): (Character, Character) = {
    if (attacker == defender) (attacker, defender)
    else (attacker, defender.hit(BASE_DMG))
  }
}
