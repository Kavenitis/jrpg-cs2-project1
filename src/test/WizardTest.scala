package test

import org.scalatest.FunSuite
import Operators._

class WizardTest extends FunSuite {

  test("takeDamage should reduce the currentHP of the Wizard by the proper amount") {
    val wizard = new Wizard("Gandalf", "Light")
    val initialHP = wizard.currentHP
    val damage = 20
    wizard.takeDamage(damage)
    val expectedHP = initialHP - damage
    assert(wizard.currentHP == expectedHP)
  }

  test("takeDamage should not reduce the currentHP to less than 0") {
    val wizard = new Wizard("Gandalf", "Light")
    wizard.currentHP = 10
    wizard.takeDamage(20)
    assert(wizard.currentHP <= 0)
  }

  test("a Wizard with currentHP <= 0 should be marked as dead") {
    val wizard = new Wizard("Gandalf", "Light")
    wizard.takeDamage(100)
    assert(wizard.isDead)
  }

  test("a Wizard with currentHP > 0 should be marked as living") {
    val wizard = new Wizard("Gandalf", "Light")
    wizard.takeDamage(10)
    assert(wizard.isAlive)
  }
}
