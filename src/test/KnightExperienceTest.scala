package test
import org.scalatest.FunSuite
import Operators._

class KnightExperienceTest extends FunSuite {

  test("gain experience should increase the experience of the Knight by the proper amount") {
    val knight = new Knight("Lancelot", "Light")
    val initialExp = knight.experience
    val gainedExp = 20
    knight.gainExperience(gainedExp)
    val expectedExp = initialExp + gainedExp
    assert(knight.experience == expectedExp)
  }

  test("level up should increase the level of the Knight by 1") {
    val knight = new Knight("Lancelot", "Light")
    val initialLevel = knight.level
    knight.experience = 120
    knight.gainExperience(20)
    val expectedLevel = initialLevel + 1
    assert(knight.level == expectedLevel)

  }
}