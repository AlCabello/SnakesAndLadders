package game.objects

import java.util.*

class Dice {
    /**
     *
     */
    fun rollDice(player: Player, position: Int): Int {
        println("${player.name} is your turn, roll the dice [PRESS ANY BUTTON]")
        val anyButton = Scanner(System.`in`).next()
        var number = (1..6).random()
        if (chekLimit(number, position))
            number = 0

        return number
    }

    /**
     *
     */
    fun chekLimit(movement: Int, position: Int): Boolean {
        if (position + movement > 99) {
            println("The number is soo big, you are going to stay here.")
            return true
        }
        return false
    }

}