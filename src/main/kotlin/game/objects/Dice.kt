package game.objects

class Dice {
    fun randomNum(): Int {
        val number = (1..6).random()
        return number
    }

}