object Game extends App {

  def startGame: Player = {
    val rack = new Bag().generateBag().take(7)
    Player(rack)
  }
}