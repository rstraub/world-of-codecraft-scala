package nl.codecraftr.worldofcodecraft

object Combat {
  def attack(attacker: Character, defender: Character): Character = {
    if (attacker == defender) defender
    else defender.copy(hp = defender.hp - 200)
  }
}
