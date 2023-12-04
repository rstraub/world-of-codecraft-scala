package nl.codecraftr.worldofcodecraft

import nl.codecraftr.worldofcodecraft.Level.ONE

case class Character(name: Name) {
  val level: Level = ONE
}

case class Name(value: String) extends AnyVal
