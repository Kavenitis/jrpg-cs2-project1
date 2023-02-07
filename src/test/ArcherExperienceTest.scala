package test
import org.scalatest.FunSuite
import Operators._

class ArcherExperienceTest extends FunSuite {

  test("gain experience should increase the experience of the Archer by the proper amount") {
    val archer = new Archer("Robin", "Light")
    val initialExp = archer.experience
    val gainedExp = 20
    archer.gainExperience(gainedExp)
    val expectedExp = initialExp + gainedExp
    assert(archer.experience == expectedExp)
  }

  test("Level up should increase the level of the Archer by 1") {
    val archer = new Archer("Robin", "Light")
    val initialLevel = archer.level
    archer.experience = 120
    archer.gainExperience(20)
    val expectedLevel = initialLevel + 1
    assert(archer.level == expectedLevel)

  }
}
