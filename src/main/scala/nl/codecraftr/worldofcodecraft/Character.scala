package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.HP.INITIAL
import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name, hp: HP = INITIAL) {
  lazy val isAlive: Boolean = hp.value > 0

  val level: Level = ONE
}
