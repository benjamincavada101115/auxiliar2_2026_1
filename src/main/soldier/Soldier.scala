package soldier

import army.Army

class Soldier(val name: String, var hp: Int, val attack: Int) {
  var isAlive: Boolean = true
  var army: Army = null

  def attackSoldier(soldier: Soldier): Unit = {
    soldier.hp -= attack
    if (soldier.hp <= 0){
      soldier.die()
      soldier.leaveArmy()
    }
  }
  def die(): Unit = {
    isAlive = false
  }

  def joinArmy(newArmy: Army): Unit = {
    if (army != null) {
      this.leaveArmy()
    }
    newArmy.join(this)
    army = newArmy
  }

  def leaveArmy(): Unit = {
    if (army != null){
      army.leave(this)
      army = null
    }
  }
}