var level: Int = 1
var exp: Int = 0
val expToLevel: Int = 100

def gainExp(points: Int): Unit = {
  exp += points
  while (exp >= expToLevel) {
    levelUp()
  }
}

def levelUp(): Unit = {
  level += 1
  maxHp += 20
  strength += 10
  exp -= expToLevel
}

def givesExp(): Int = {
  level * 10 + maxHp
}