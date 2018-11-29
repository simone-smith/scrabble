object Game extends App {

  def startGame: Player = {
    val rack = new Bag().generateBag().take(7)
    Player(rack)
  }

  def findValidWords(rack: String): List[String] = {
    val validWords = Set("hello", "help", "kelp")
    Iterator.range(1, rack.length + 1)
      .flatMap(rack.combinations)
      .flatMap(_.permutations)
      .filter(validWords).toList
  }
}