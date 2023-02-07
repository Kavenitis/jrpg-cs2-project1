package test

import org.scalatest.FunSuite
import Operators._

class ArcherTest extends FunSuite {

  test("takeDamage should reduce the currentHP of the Archer by the proper amount") {
    val archer = new Archer("Legolas", "Light")
    val initialHP = archer.currentHP
    val damage = 20
    archer.takeDamage(damage)
    val expectedHP = initialHP - damage
    assert(archer.currentHP == expectedHP)
  }

  test("takeDamage should not reduce the currentHP to less than 0") {
    val archer = new Archer("Legolas", "Light")
    archer.currentHP = 10
    archer.takeDamage(20)
    assert(archer.currentHP <= 0)
  }

  test("an Archer with currentHP <= 0 should be marked as dead") {
    val archer = new Archer("Legolas", "Light")
    archer.takeDamage(100)
    assert(archer.isDead)
  }

  test("an Archer with currentHP > 0 should be marked as living") {
    val archer = new Archer("Legolas", "Light")
    archer.takeDamage(10)
    assert(archer.isAlive)
  }
}