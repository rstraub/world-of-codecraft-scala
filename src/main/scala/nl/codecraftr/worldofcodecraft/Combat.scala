package nl.codecraftr.worldofcodecraft

object Combat {
  private def BASE_DMG = 200
  private val XP_PER_KILL = XP(500)

  def attack(
      attacker: Character,
      defender: Character
  ): (Character, Character) = {
    if (attacker == defender) return (attacker, defender)

    val newDefender = defender.hit(BASE_DMG)

    val newAttacker =
      if (newDefender.isDead) attacker.gain(XP_PER_KILL)
      else attacker

    (newAttacker, newDefender)
  }
}
