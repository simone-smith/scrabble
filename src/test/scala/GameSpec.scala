import org.scalatest._

class GameSpec extends FlatSpec with Matchers {
  "A player" should "have a rack of 7 letters" in {
    assert(Game.startGame.rack.length == 7)
  }

  "A rack with the letters 'jkepils" should "return 'kelp'" in {
    assert(Game.findValidWords("jkepils") == List("kelp"))
  }
}
