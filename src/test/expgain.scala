import org.scalatest.FlatSpec
import main.character

class CharacterTest extends FlatSpec {

  "A character" should " Gain 20 experience points when it gets a kill" in {
    val character = new Character("Hero", "Bruiser")
    character.addExperience()
    assert(character.experience == 20)
  }

  it should "level up when it reaches 100 experience points" in {
    val character = new Character("Hero", "Bruiser")
    character.experience = 80
    character.addExperience()
    assert(character.level == 2)
  }
}