package nl.codecraftr.worldofcodecraft

case class Attack(attacker: Character, defender: Character) {
  def execute: Character = {
    require(attacker != defender, "Cannot attack self")

    defender.copy(hp = defender.hp - 200)
  }
}
