import org.scalatest.{FunSuite, Matchers}
import main.party

class PartyTest extends FunSuite with Matchers {
  test("gain Experience Test") {
    val character1 = new Character("Vi", "Bruiser")
    val character2 = new Character("Ornn", "Tank")
    val defeatedCharacter1 = new Character("AbdulAziz", "Mage")
    val defeatedCharacter2 = new Character("Zilean", "Mage")
    defeatedCharacter1.takeDamage(defeatedCharacter1.hp)
    defeatedCharacter2.takeDamage(defeatedCharacter2.hp)

    val defeatedParty = new Party(List(defeatedCharacter1, defeatedCharacter2))
    val party = new Party(List(character1, character2))

    party.gainExperience(defeatedParty)

    party.characters.foreach { character =>
      character.experience should be(20)
    }
  }
}