package nl.codecraftr.worldofcodecraft

import scala.collection.mutable

object Game {
  private val characters = mutable.Set[Name]()

  def createCharacter(name: Name): Option[Character] = {
    if (characters.contains(name)) None
    else {
      characters += name
      Some(Character(name))
    }
  }
}
