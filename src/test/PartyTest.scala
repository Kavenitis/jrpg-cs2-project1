import Operators._
import org.scalatest.funsuite.AnyFunSuite

class PartyTest extends AnyFunSuite {
  test("ted") {
    val character1 = new Wizard("Attacker", "Heavy")
    character1.takeDamage(1000)
    assert(character1.isDead == true)
    val character2 = new Archer("Target", "Heavy")
    val character3 = new Knight("Target", "Heavy")
    val character4 = new Viking("Target", "Heavy")
    val character5 = new Samurai("Target", "Heavy")
    character1.gainExperience(0)
    character2.gainExperience(5)
    character3.gainExperience(5)
    character4.gainExperience(5)
    character5.gainExperience(5)
    val party: Party = new Party(List(character1, character2, character3, character4, character5))
    val party1: Party = new Party(List(character1, character2, character3, character4, character5))

    party.defeatedBy(party1)
  }
}