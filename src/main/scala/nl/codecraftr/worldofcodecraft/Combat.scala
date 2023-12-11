package nl.codecraftr.worldofcodecraft

object Combat {
  private def BASE_DMG = 200

  def attack(
      attacker: Character,
      defender: Character
  ): (Character, Character) = {
    if (attacker == defender) return (attacker, defender)

    val newDefender = defender.hit(BASE_DMG)

    val newAttacker =
      if (newDefender.isDead) attacker.gainXP(BASE_DMG)
      else attacker

    (newAttacker, newDefender)
  }
}
