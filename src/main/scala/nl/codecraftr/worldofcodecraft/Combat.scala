package nl.codecraftr.worldofcodecraft

object Combat {
  private def BASE_DMG = 200
  private val XP_PER_KILL = XP(500)

  def attack(
      attacker: Character,
      defender: Character
  ): (Character, Character) = {
    if (attacker == defender) return (attacker, defender)

    val damage = calculateDamage(attacker, defender)
    val newDefender = defender.hit(damage)

    val newAttacker =
      if (newDefender.isDead) attacker.gain(XP_PER_KILL)
      else attacker

    (newAttacker, newDefender)
  }

  private def calculateDamage(attacker: Character, defender: Character) = {
    val levelDifference: Int = attacker.level.value - defender.level.value

    val damageMultiplier: Double = 1 + (levelDifference * 0.25)

    (BASE_DMG * damageMultiplier).toInt
  }
}
