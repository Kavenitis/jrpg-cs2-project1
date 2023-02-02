

class Party(val characters: List[Character]) {
  def gainExperience(defeatedParty: Party): Unit = {
    val defeatedCharacters = defeatedParty.characters
    defeatedCharacters.foreach { character =>
      if (!character.isAlive) {
        characters.foreach { ch =>
          ch.experience += 20
          if (ch.experience >= 100) {
            ch.experience = ch.experience - 100
            ch.level += 1
          }
        }
      }
    }
  }
}