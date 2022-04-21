package game.objects

/**
 * StairSquare is an object class.
 * In this object we have the properties of a default Square.
 *
 * @property[goTo] Indicates the position of the pointed Square.
 * @property[playersIn] Indicates the players inside the Square.
 */
open class Square(val goTo: Int = 0, val playersIn: MutableList<Player> = mutableListOf()) {
    /**
     * This is a default function, the son objects can overwrite it.
     */
    open fun go() {

    }
}
