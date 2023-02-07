package test
import org.scalatest._
import Operators._

class AttackTest extends FunSuite {

  test("Physical Attack Test") {
    val attacker = new Knight("Knight", "Heavy")
    val target = new Samurai("Samurai", "Light")

    attacker.physicalAttack(target)
    val expectedDamage = attacker.attackPower
    val actualDamage = target.currentHP - target.maxHP

    assert(expectedDamage == actualDamage)
  }

  test("Magic Attack Test") {
    val attacker = new Knight("Knight", "Heavy")
    val target = new Samurai("Samurai", "Light")

    attacker.magicAttack(10, target)
    val expectedDamage = attacker.magicAttack
    val actualDamage = target.currentHP - target.maxHP

    assert(expectedDamage == actualDamage)
  }

  test("Ranged Attack Test") {
    val attacker = new Knight("Knight", "Heavy")
    val target = new Samurai("Samurai", "Light")

    attacker.rangedAttack(target)
    val expectedDamage = attacker.rangeAttack
    val actualDamage = target.currentHP

    assert(expectedDamage == actualDamage)
  }

}