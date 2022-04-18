package game.objects

open class Square(val goTo : Int = 0 ,val playersIn: MutableList<Player> = mutableListOf()) {
    open fun go() {

    }
    override fun toString(): String {
        return "Square(playersIn=$playersIn)"
    }

}
