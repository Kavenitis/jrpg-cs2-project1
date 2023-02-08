import Operators.Characters




class Party(val members: List[Characters]) {
  def defeatedBy(winningParty: Party): Unit = {
    val totalExperience = members.map(member => member.experience).sum
    val livingMembers = winningParty.members.filter(member => member.isAlive)
    val experiencePerMember = totalExperience / livingMembers.length
    for (member <- livingMembers)
    {
      member.gainExperience(experiencePerMember)
    }
  }

}