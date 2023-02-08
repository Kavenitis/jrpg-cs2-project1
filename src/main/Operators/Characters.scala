package Operators

abstract class Characters {
  var maxHP: Int
  var currentHP: Int
  var armor: Int
  var magicResist: Int
  var attackPower: Int
  var empoweredAttack: Int
  var magicAttack: Int
  var rangeAttack: Int
  var maxAbilityPower: Int
  var currentAbilityPower: Int = maxAbilityPower
  var isAlive: Boolean = true
  var isDead: Boolean = true
  var level: Int = 1
  var experience: Int = 0
  var expToLevelUp: Int = 100

  def takeDamage(damage: Int)
  def performMagic(cost: Int): Unit = {
    currentAbilityPower = currentAbilityPower - cost
  }

  def physicalAttack(player: Characters, attackType: String): Unit = {
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

  def rangedAttack(player: Characters, attackType: String): Unit = {
    val damage = rangeAttack - player.armor
    if (damage > 0) player.takeDamage(damage)
  }

  def levelUp(): Unit = {
    level += 1
    experience -= expToLevelUp
  }

  def gainExperience(exp: Int): Unit = {
  }

  def onLevelUp(): Unit = {

  }

  def battleOptions(): List[String] = {
    var options: List[String] = List()
    options:+ "Arrow shot"
    options:+ "Backup sword"
    options:+ "Double arrow shot"
    options:+ "Sword swing"
    options:+ "Shuriken throw"
    options:+ "Combo swings"
    options:+ "Shield wall"
    options:+ "Charge forward"
    options:+ "Breserk"
    options:+ "Poison weapon"
  }

  def takeAction(action: String, player: Characters): Unit = {
    action match {
      case "Backup sword" => physicalAttack(player, "basicAttack")
      case "Sword swing" => physicalAttack(player, "basicAttack")
      case "Charge forward" => physicalAttack(player, "basicAttack")
      case "Double arrow shot" => rangedAttack(player, "empoweredAttack")
      case "Combo swing" => physicalAttack(player, "empoweredAttack")
      case "Breserk" => physicalAttack(player, "empoweredAttack")
      case "Shuriken throw" => rangedAttack(player, "rangeAttack")
      case "Arrow shot" => rangedAttack(player, "rangeAttack")
      case "Poison weapon" => magicAttack(25, player)
    }
  }
}


