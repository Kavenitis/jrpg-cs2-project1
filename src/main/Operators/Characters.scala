package Operators

abstract class Characters {
  val maxHP: Int
  var currentHP: Int = maxHP
  val armor: Int
  val magicResist: Int
  val attackPower: Int
  val magicAttack: Int
  val rangeAttack: Int
  val maxAbilityPower: Int
  var currentAbilityPower: Int = maxAbilityPower
  var isAlive: Boolean = true
  var isDead: Boolean = true
  var level: Int = 1
  var experience: Int = 0
  val expToLevelUp: Int = 100

  def takeDamage(damage: Int)
  def performMagic(cost: Int): Unit = {
    currentAbilityPower = currentAbilityPower - cost
  }

  def physicalAttack(player: Characters): Unit = {
    val damage = attackPower - player.armor
    if (damage > 0) player.takeDamage(damage)
  }

  def magicAttack(cost: Int, player: Characters): Unit = {
    if (currentAbilityPower >= cost) {
      val damage = magicAttack - player.magicResist
      if (damage > 0) player.takeDamage(damage)
      currentAbilityPower -= cost
    }
  }

  def rangedAttack(player: Characters): Unit = {
    val damage = rangeAttack - player.armor
    if (damage > 0) player.takeDamage(damage)
  }

  def levelUp(): Unit = {
    level += 1
    experience -= expToLevelUp
  }

  def gainExperience(exp: Int): Unit = {
    experience += exp
    if (experience >= expToLevelUp) {
      levelUp()
    }
  }





}


