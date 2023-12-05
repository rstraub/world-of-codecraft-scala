package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.HP.{INITIAL, ZERO}
import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name, hp: HP = INITIAL) {
  lazy val isAlive: Boolean = hp > ZERO

  val level: Level = ONE
}
