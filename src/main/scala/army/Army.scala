package army

import soldier.Soldier

import scala.collection.mutable.ArrayBuffer

class Army(val name: String) {
  private val soldiers: ArrayBuffer[Soldier] = new ArrayBuffer[Soldier]

  def join(soldier: Soldier): Unit = {
    soldiers += soldier
  }

  def leave(soldier: Soldier): Unit = {
    val index: Int = soldiers. indexOf(soldier)
    if (index >= 0) {
      soldiers.remove(index)
    }
  }

  def showRoster(): Unit = {
    val names = this.soldiers.map(_.name).mkString(", ")
    println(s"Integrantes de ${this.name}: [${if (names.nonEmpty) names else "(vacío)"}]")
  }
}