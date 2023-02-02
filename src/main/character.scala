class Character(val name: String, val Class: String) {
  var baseHp: Int = 0
  var baseAttack: Int = 0
  var rangeAttack: Int = 0
  var mana: Int = 100
  var movement: Int = 0
  var baseArmor: Int = 100
  var baseMR: Int = 0

  var isAlive: Boolean = true
  if(Class == "Tank"){
    baseHp = 1000
    baseAttack = 100
    baseArmor = 10
    baseMR = 10
    movement = 10
    rangeAttack = 10
    mana = 0
  } else if(Class == "Bruiser"){
    baseHp = 10
    baseAttack = 10
    baseArmor = 10
    movement = 5
    rangeAttack = 40
  } else{
    baseHp = 10
    baseAttack = 10
    movement = 10
    rangeAttack = 60
  }

  baseHp.floor.toInt
  baseAttack.floor.toInt

  var hp: Int = baseHp
  var armor: Int = baseArmor
  var experience: Int = 0
  var level: Int = 1

  def takeDamage(hit: Int): Unit = {
    hp = hp - hit

    if (hp <= 0) {
      isAlive = false
    }
  }

  def addExperience(): Unit = {
    experience += 20
    if (experience >= 100) {
      levelUp()
    }
  }

  def levelUp(): Unit = {
    level += 1
    experience = experience - 100
  }
}



