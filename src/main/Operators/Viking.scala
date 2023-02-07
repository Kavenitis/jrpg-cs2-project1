package Operators

class Viking(var name: String, var weightClass: String) extends Characters {
  val maxHP = 100
  val armor = 50
  val magicResist = 20
  val attackPower = 40
  val magicAttack = 0
  val maxAbilityPower = 0
  val rangeAttack = 0

  override def takeDamage(damage: Int): Unit = {
    currentHP -= damage
    if (currentHP <= 0) {
      isDead = true
    } else {
      isAlive = true
    }
  }
}
