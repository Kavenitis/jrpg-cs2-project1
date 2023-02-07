package test
import org.scalatest.FunSuite
import Operators._

class VikingExperienceTest extends FunSuite {

  test("Gain experience should increase the experience of the Viking by the proper amount") {
    val viking = new Viking("Bjorn", "Heavy")
    val initialExp = viking.experience
    val gainedExp = 20
    viking.gainExperience(gainedExp)
    val expectedExp = initialExp + gainedExp
    assert(viking.experience == expectedExp)
  }

  test("Level up should increase the level of the Viking by 1") {
    val viking = new Viking("Bjorn", "Heavy")
    val initialLevel = viking.level
    viking.experience = 120
    viking.gainExperience(20)
    val expectedLevel = initialLevel + 1
    assert(viking.level == expectedLevel)
  }
}