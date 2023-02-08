package Operators

class Viking(var name: String, var weightClass: String) extends Characters {
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
    } else {
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
    rangeAttack += 0
    empoweredAttack = 0
    if (level >= 4) {
      magicAttack += 20
    }
  }

  override def battleOptions(): List[String] = {
    var options: List[String] = List()
    options :+ "Sword swing"
    options :+ "Charge forward"
    options :+ "Breserk"
    options:+ "Poison weapon"
  }

  override def takeAction(action: String, player: Characters): Unit = {
    action match {
      case "Sword swing" => physicalAttack(player, "basicAttack")
      case "Charge forward" => physicalAttack(player, "basicAttack")
      case "Breserk" => physicalAttack(player, "empoweredAttack")
      case "Poison weapon" => magicAttack(25, player)
    }
  }
}
