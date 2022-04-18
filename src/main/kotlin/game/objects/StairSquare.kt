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
class StairSquare(goTo: Int, playersIn: MutableList<Player> = mutableListOf()) : Square(goTo, playersIn) {
    /**
     * Move the user to the new position.
     *
     */
    override fun go() {
        println("Stair square, you go to ${goTo+1}")
    }
    override fun toString(): String {
        return "StairSquare(goTo=$goTo)"
    }
}