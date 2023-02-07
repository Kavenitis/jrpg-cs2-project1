package test
import org.scalatest.FunSuite
import Operators._

class WizardExperienceTest extends FunSuite {

  test("Gain experience should increase the experience of the Wizard by the proper amount") {
    val wizard = new Wizard("Merlin", "Light")
    val initialExp = wizard.experience
    val gainedExp = 20
    wizard.gainExperience(gainedExp)
    val expectedExp = initialExp + gainedExp
    assert(wizard.experience == expectedExp)
  }

  test("Level up should increase the level of the Wizard by 1") {
    val wizard = new Wizard("Merlin", "Light")
    val initialLevel = wizard.level
    wizard.experience = 120
    wizard.gainExperience(20)
    val expectedLevel = initialLevel + 1
    assert(wizard.level == expectedLevel)

  }
}
