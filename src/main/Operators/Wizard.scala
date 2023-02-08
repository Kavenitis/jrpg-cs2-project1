package Operators

class Wizard(var name: String, var weightClass: String) extends Characters {
  override var maxHP = 100
  override var armor = 50
  override var currentHP = 100
  override var magicResist = 20
  override var attackPower = 40
  override var empoweredAttack = 0
  override var magicAttack = 0
  override var maxAbilityPower = 0
  override var rangeAttack = 0

  override def takeDamage(damage: Int): Unit = {
    currentHP -= damage
    if (currentHP <= 0) {
      isDead = true
    }else{
      isAlive = true
    }
  }

  override def gainExperience(expGained: Int): Unit = {
    experience += expGained
    if (experience >= 100) {
      level += 1
      experience = experience - 100
    }
  }

  override def onLevelUp(): Unit = {
    maxHP += 20
    armor += 10
    currentHP += 20
    magicResist += 5
    attackPower += 5
    magicAttack += 0
    maxAbilityPower += 0
    rangeAttack += 10
    empoweredAttack += 0
  }
}