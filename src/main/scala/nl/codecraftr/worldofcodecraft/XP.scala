package nl.codecraftr.worldofcodecraft

case class XP(value: Int) {
  require(value >= 0, "XP cannot be negative")

  def +(points: XP): XP = XP(value + points.value)

  lazy val level: Level = {
    value match {
      case x if x >= 42715 => Level(10)
      case x if x >= 28477 => Level(9)
      case x if x >= 18984 => Level(8)
      case x if x >= 12656 => Level(7)
      case x if x >= 8438  => Level(6)
      case x if x >= 5625  => Level(5)
      case x if x >= 3750  => Level(4)
      case x if x >= 2500  => Level(3)
      case x if x >= 1000  => Level(2)
      case _               => Level(1)
    }
  }
}

object XP {
  val ZERO: XP = XP(0)
}
