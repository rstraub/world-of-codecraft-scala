package nl.codecraftr.worldofcodecraft

case class HP(value: Int) extends AnyVal

object HP {
  val INITIAL: HP = HP(1000)
}
