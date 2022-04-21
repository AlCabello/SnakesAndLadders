package game.objects

import java.util.*

/**
 * The object dice, have one function and one procedure, needed to make
 * it work fine.
 */
class Dice {
    /**
     * The function roll dice returns a random number.
     * We ask the user to press any key, because I want to give her
     * the feeling of the action, because he doesn't have a real dice.
     *
     * @return[Int] Returns a random number.
     */
    fun rollDice(player: Player, position: Int): Int {
        println("${player.name} is your turn, roll the dice [PRESS ANY BUTTON]")
        val anyButton = Scanner(System.`in`).next()
        val number = (1..6).random()
        println("Your number is $number")
        return number
    }

}