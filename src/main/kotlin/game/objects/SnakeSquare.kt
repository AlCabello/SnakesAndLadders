package game.objects

class SnakeSquare(val goTo: List<Int>, playersIn: MutableList<Player> = mutableListOf()) : Square(playersIn) {
    fun goDown() {

    }

    override fun toString(): String {
        return "SnakeSquare(goTo=$goTo)"
    }
}