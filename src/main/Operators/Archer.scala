package Operators

class Archer(var name: String, var weightClass: String) extends Characters {
  val maxHP = 100
  val armor = 50
  val magicResist = 20
  val attackPower = 10
  val magicAttack = 0
  val maxAbilityPower = 0
  val rangeAttack = 80


  override def takeDamage(damage: Int): Unit = {
    currentHP -= damage
    if (currentHP <= 0) {
      isDead = true
    }else{
      isAlive = true
    }
  }

  override def gainExperience(exp: Int): Unit = {
    experience += exp
    if (experience >= expToLevelUp) {
      level += 1
      experience -= expToLevelUp
    }
  }

}
