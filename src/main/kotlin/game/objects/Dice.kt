package game.objects

import java.util.*

/**
 * The object dice, have one function and one procedure, needed to make
 * it work fine.
 */
class Dice {
    /**
     * The function roll dice returns a random number, then call
     * the procedure checkLimit, if is true and overpass the limit,
     * the number is converted to 0, cause the user can't overpass it.
     * We ask the user to press any key, because I want to give her
     * the feeling of the action, because he doesn't have a real dice.
     *
     * @return[Int] Returns a random number.
     */
    fun rollDice(player: Player, position: Int): Int {
        println("${player.name} is your turn, roll the dice [PRESS ANY BUTTON]")
        val anyButton = Scanner(System.`in`).next()
        var number = (1..6).random()
        println("The dice number is $number")
        if (checkLimit(number, position))
            number = 0

        return number
    }

    /**
     * Check if the position of the user, plus the number of movements,
     * is more than the last position of the board, in this case 99.
     */
    fun checkLimit(movement: Int, position: Int): Boolean {
        if (position + movement > 99) {
            println("The number is soo big, you are going to stay here.")
            return true
        }
        return false
    }

}