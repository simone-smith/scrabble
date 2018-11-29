import org.scalatest._

class GameSpec extends FlatSpec with Matchers {
  "A player" should "have a rack of 7 letters" in {
    assert(Game.startGame.rack.length == 7)
  }

  "A rack with the letters 'aaaaaah" should "return 'ah'" in {
    assert(Game.findValidWords("aaaaaah") == List("aa", "ah", "ha", "aah", "aha"))
  }
}
