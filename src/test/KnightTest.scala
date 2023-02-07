package test
import org.scalatest.FunSuite
import Operators._

class KnightTest extends FunSuite {

  test("takeDamage should reduce the currentHP of the Knight by the proper amount") {
    val knight = new Knight("Sir Lancelot", "Heavy")
    val initialHP = knight.currentHP
    val damage = 20
    knight.takeDamage(damage)
    val expectedHP = initialHP - damage
    assert(knight.currentHP == expectedHP)
  }

  test("takeDamage should not reduce the currentHP to less than 0") {
    val knight = new Knight("Sir Lancelot", "Heavy")
    knight.currentHP = 10
    knight.takeDamage(20)
    assert(knight.currentHP <= 0)
  }

  test("a Knight with currentHP <= 0 should be marked as dead") {
    val knight = new Knight("Sir Lancelot", "Heavy")
    knight.takeDamage(100)
    assert(knight.isDead)
  }

  test("a Knight with currentHP > 0 should be marked as living") {
    val knight = new Knight("Sir Lancelot", "Heavy")
    knight.takeDamage(10)
    assert(knight.isAlive)
  }
}