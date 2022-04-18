package game.objects

class SnakeSquare(goTo: Int, playersIn: MutableList<Player> = mutableListOf()) : Square(goTo ,playersIn) {
    override fun go() {
        println("Snake square, you go to ${goTo+1}")
    }

    override fun toString(): String {
        return "SnakeSquare(goTo=$goTo)"
    }
}