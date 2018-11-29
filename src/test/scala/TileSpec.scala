import org.scalatest._
import scrabble.Tile

class TileSpec extends FlatSpec with Matchers {
  "The letter A" should "be worth 1 point" in {
    assert(Tile('A').value == 1)
  }

  "The letter D" should "be worth 2 points" in {
    assert(Tile('D').value == 2)
  }

  "The letter K" should "be worth 5 points" in {
    assert(Tile('K').value == 5)
  }
}