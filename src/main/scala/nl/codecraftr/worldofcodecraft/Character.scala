package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.HP.{INITIAL, ZERO}
import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name, hp: HP = INITIAL) {
  def hit(points: Int): Character =
    if (points > hp.value) copy(hp = ZERO)
    else copy(hp = hp - points)

  lazy val isAlive: Boolean = hp > ZERO

  val level: Level = ONE
}
