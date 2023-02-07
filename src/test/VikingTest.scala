package test
import org.scalatest.FunSuite
import Operators._

class VikingTest extends FunSuite {

  test("takeDamage should reduce the currentHP of the Viking by the proper amount") {
    val viking = new Viking("Ragnar", "Heavy")
    val initialHP = viking.currentHP
    val damage = 20
    viking.takeDamage(damage)
    val expectedHP = initialHP - damage
    assert(viking.currentHP == expectedHP)
  }

  test("takeDamage should not reduce the currentHP to less than 0") {
    val viking = new Viking("Ragnar", "Heavy")
    viking.currentHP = 10
    viking.takeDamage(20)
    assert(viking.currentHP <= 0)
  }

  test("a Viking with currentHP <= 0 should be marked as dead") {
    val viking = new Viking("Ragnar", "Heavy")
    viking.takeDamage(100)
    assert(viking.isDead)
  }

  test("Viking currentHP > 0 should be marked as living") {
    val viking = new Viking("Ragnar", "Heavy")
    viking.takeDamage(10)
    assert(viking.isAlive)
  }
}