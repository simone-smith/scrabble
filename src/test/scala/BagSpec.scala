import org.scalatest._

class BagSpec extends FlatSpec with Matchers {
  "The bag" should "have 101 letters" in {
    assert(new Bag().generateBag().length == 101)
  }

  // more tests to check that the right number of each letter is in the bag
}