import org.scalatest.FunSuite
import Operators.{Archer, Knight}

class ArcherTakeActionTest extends FunSuite {

  test("An Archer should have correct battle options") {
    val archer = new Archer("John", "Light")
    val options = archer.battleOptions()
    assert(options.contains("Arrow shot"))
    assert(options.contains("Backup sword"))
    assert(options.contains("Double arrow shot"))
  }

  test("An Archer should be able to take action in battle") {
    val archer = new Archer("John", "Light")
    val enemy = new Knight("Lancelot", "Heavy")
    archer.takeAction("Backup sword", enemy)
    assert(enemy.currentHP < 100)
    archer.takeAction("Double arrow shot", enemy)
    assert(enemy.currentHP < 90)
    archer.takeAction("Arrow shot", enemy)
    assert(enemy.currentHP < 80)
  }
}