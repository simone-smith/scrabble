package scrabble

case class Tile(letter: Char) {
  def value: Int = {
    letter match {
      case 'A'|'E'|'I'|'L'|'N'|'O'|'R'|'S'|'T'|'U' => 1
      case 'D'|'G' => 2
      case 'B'|'C'|'M'|'P' => 3
      case 'F'|'H'|'V'|'W'|'Y' => 4
      case 'K' => 5
      case 'J'|'X' => 8
      case 'Q'|'Z' => 10
      case _ => 0
    }
  }
}
