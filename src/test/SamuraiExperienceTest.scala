package test
import org.scalatest.FunSuite
import Operators._

class SamuraiExperienceTest extends FunSuite {

  test("Gain experience should increase the experience of the Samurai by the proper amount") {
    val samurai = new Samurai("Hattori Hanzo", "Light")
    val initialExp = samurai.experience
    val gainedExp = 20
    samurai.gainExperience(gainedExp)
    val expectedExp = initialExp + gainedExp
    assert(samurai.experience == expectedExp)
  }

  test("Level up should increase the level of the Samurai by 1") {
    val samurai = new Samurai("Hattori Hanzo", "Light")
    val initialLevel = samurai.level
    samurai.experience = 120
    samurai.gainExperience(20)
    val expectedLevel = initialLevel + 1
    assert(samurai.level == expectedLevel)
  }
}