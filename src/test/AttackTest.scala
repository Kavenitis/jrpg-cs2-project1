package test
import org.scalatest._
import Operators._

class AttackTest extends FunSuite {

  test("Physical Attack Test") {
    val attacker = new Knight("Knight", "Heavy")
    val target = new Samurai("Samurai", "Light")

    attacker.physicalAttack(target, "Heavy")
    val expectedDamage = attacker.attackPower
    val actualDamage = target.currentHP - attacker.attackPower
    val expectedDamageTaken = target.currentHP - actualDamage

    assert(expectedDamage == expectedDamageTaken)
  }

  test("Magic Attack Test") {
    val attacker = new Knight("Knight", "Heavy")
    val target = new Samurai("Samurai", "Light")

    attacker.magicAttack(10, target)
    val expectedDamage = attacker.magicAttack
    val actualDamage = target.currentHP - attacker.magicAttack
    val expectedDamageTaken = target.currentHP - actualDamage

    assert(expectedDamage == expectedDamageTaken)
  }

  test("Ranged Attack Test") {
    val attacker = new Archer("Legolas", "Light")
    val target = new Samurai("Samurai", "Light")

    attacker.rangedAttack(target, "Light")
    val expectedDamage = attacker.rangeAttack + attacker.attackPower
    val actualDamage = target.currentHP - attacker.rangeAttack - attacker.attackPower
    val expectedDamageTaken = target.currentHP - actualDamage

    assert(expectedDamage == expectedDamageTaken)
  }

}