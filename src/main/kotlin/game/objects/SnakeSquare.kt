package game.objects

/**
 * SnakeSquare is an object class, son of square.
 * In this object we have the properties of a normal Square,
 * and the constant(val) goTo indicates with an integers the
 * position of the pointed Square.
 *
 * @property[goTo] Indicates the position of the pointed Square.
 * @property[playersIn] Indicates the players inside the Square.
 */
class SnakeSquare(goTo: Int, playersIn: MutableList<Player> = mutableListOf()) : Square(goTo, playersIn) {
    /**
     * Print the new position of the user, the +1 is because
     * the board list starts in 0, then every square is 1 number
     * under the real position.
     */
    override fun go() {
        println("Snake square, you go to ${goTo + 1}")
    }
}