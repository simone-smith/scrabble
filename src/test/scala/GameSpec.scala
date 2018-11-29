import org.scalatest._

class GameSpec extends FlatSpec with Matchers {
  "A player" should "have a rack of 7 letters" in {
    assert(Game.startGame.rack.length == 7)
  }
}
