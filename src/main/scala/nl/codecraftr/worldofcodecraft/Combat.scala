package nl.codecraftr.worldofcodecraft

object Combat {
  private def BASE_DMG = 200

  def attack(attacker: Character, defender: Character): Character = {
    if (attacker == defender) defender
    else defender.hit(BASE_DMG)
  }
}
