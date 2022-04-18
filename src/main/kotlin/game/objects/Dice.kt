package game.objects

import java.util.*

class Dice {
    fun rollDice(player: Player): Int {
        println("${player.name} is your turn, ready?")
        val number = (1..6).random()
        if (Scanner(System.`in`).next().uppercase() in listOf("Y","YES","READY","S","SI")){
            println("Great, here is your number $number")
        }
        else{
            println("Don't care, here is your number $number")

        }
    return 99
        //return number
    }

}