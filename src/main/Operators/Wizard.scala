package Operators

class Wizard(var name: String, var weightClass: String) extends Characters {
  val maxHP = 100
  val armor = 50
  val magicResist = 20
  val attackPower = 0
  val magicAttack = 60
  val maxAbilityPower = 60
  val rangeAttack = 60

  override def takeDamage(damage: Int): Unit = {
    currentHP -= damage
    if (currentHP <= 0) {
      isDead = true
    }else{
      isAlive = true
    }
  }
}