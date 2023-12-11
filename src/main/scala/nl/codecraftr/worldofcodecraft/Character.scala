package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.HP.{INITIAL, ZERO}
import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name, hp: HP = INITIAL, xp: XP = XP.ZERO) {
  lazy val isAlive: Boolean = hp > ZERO
  lazy val level: Level = xp.level

  def hit(points: Int): Character =
    if (points > hp.value) copy(hp = ZERO)
    else copy(hp = hp - points)

  def gainXP(points: Int): Character = copy(xp = xp + points)
}
