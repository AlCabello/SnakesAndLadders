package game.model

open class Square (val playersIn : MutableList<Player> = mutableListOf()){
    override fun toString(): String {
        return "Square(playersIn=$playersIn)"
    }

}
