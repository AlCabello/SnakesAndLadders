package game.objects

/**
 * StairSquare is a object class, son of square.
 * In this object we have the properties of a normal Square,
 * and the constant(val) goTo indicates with 2 integers the
 * position of the objective Square.
 *
 * @property[goTo] Indicates the position of the pointed Square.
 * @property[playersIn] Indicates the players inside the Square.
 */
class StairSquare(val goTo: List<Int>, playersIn: MutableList<Player> = mutableListOf()) : Square(playersIn) {
    /**
     * Move the user to the new position.
     *
     */
    fun goUp() {

    }

    override fun toString(): String {
        return "StairSquare(goTo=$goTo)"
    }
}