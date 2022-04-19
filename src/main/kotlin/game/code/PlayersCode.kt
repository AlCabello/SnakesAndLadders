package game.code

import game.objects.Player
import java.util.*

/**
 *
 */
fun createPlayer(): Player {
    println("Give me the name of the new player.")
    val name = Scanner(System.`in`).next()
    println("Player $name created.")
    return Player(name)
}

/**
 *
 */
fun playersList(playersCount: Int): List<Player> {
    println("Create the $playersCount players.")
    return List(playersCount) { createPlayer() }
}

/**
 *
 */
fun countPlayers(): List<Player> {
    println("How many players will you be? [2/3/4].")
    val playersCount = Scanner(System.`in`).nextInt()
    if (playersCount !in 2..4) {
        println("ERROR, try again.")
        return countPlayers()
    } else
        return playersList(playersCount)
}