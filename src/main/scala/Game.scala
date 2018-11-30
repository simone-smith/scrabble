import scala.io.Source

object Game extends App {

  def startGame: Player = {
    // is the player really necessary here?
    val rack = new Bag().generateBag().take(7)
    Player(rack)
  }

  def findValidWords(rack: String): List[String] = {
    val filename = "src/main/validWords.txt"
    val validWords: Set[String] = Source.fromFile(filename).getLines.toSet
    Iterator.range(0, rack.length)
      .flatMap(rack.combinations)
      .flatMap(_.permutations)
      .filter(validWords).toList
  }

  // find the longest valid word

  // check the score of each valid word and return the word with the highest score

  // find the highest scoring word if any one of the letters can score triple

  // multiplayer?
}