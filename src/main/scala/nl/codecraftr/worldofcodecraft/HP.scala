package nl.codecraftr.worldofcodecraft

case class HP(value: Int) extends AnyVal {
  def -(points: Int): HP = HP(value - points)
  def >(other: HP): Boolean = value > other.value
}

object HP {
  val ZERO: HP = HP(0)
  val INITIAL: HP = HP(1000)
}
