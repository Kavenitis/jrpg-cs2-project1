package test
import org.scalatest.FunSuite
import Operators._

class SamuraiTest extends FunSuite {

  test("takeDamage should reduce the currentHP of the Samurai by the proper amount") {
    val samurai = new Samurai("Kenshin", "Light")
    val initialHP = samurai.currentHP
    val damage = 20
    samurai.takeDamage(damage)
    val expectedHP = initialHP - damage
    assert(samurai.currentHP == expectedHP)
  }

  test("takeDamage should not reduce the currentHP to less than 0") {
    val samurai = new Samurai("Kenshin", "Light")
    samurai.currentHP = 10
    samurai.takeDamage(20)
    assert(samurai.currentHP <= 0)
  }

  test("a Samurai with currentHP <= 0 should be marked as dead") {
    val samurai = new Samurai("Kenshin", "Light")
    samurai.takeDamage(100)
    assert(samurai.isDead)
  }

  test("a Samurai with currentHP > 0 should be marked as living") {
    val samurai = new Samurai("Kenshin", "Light")
    samurai.takeDamage(10)
    assert(samurai.isAlive)
  }
}
