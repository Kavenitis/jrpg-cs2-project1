
import main.character
import org.scalatest._

class CharacterTest extends FunSuite {

  test("takeDamage") {
    val character = new Character("Test Character", "Bruiser")
    character.takeDamage(50)
    assert(character.hp == (character.baseHp - 50))
    character.takeDamage(1000)
    assert(character.isAlive == false)
  }

}
