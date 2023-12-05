package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.HP.INITIAL
import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name) {
  val level: Level = ONE
  val hp: HP = INITIAL
}
