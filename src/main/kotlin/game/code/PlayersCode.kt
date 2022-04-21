package game.code

import game.objects.Player
import java.util.*

/**
 * Create an object Player, the Scanner reads an input and make it
 * the name of the player.
 * @return[Player] Object player with the new name inside.
 */
fun createPlayer(): Player {
    println("Give me the name of the new player.")
    val name = Scanner(System.`in`).next()
    println("Player $name created.")
    return Player(name)
}

/**
 *  Create a list of Players, the size of the list is the
 *  number of players selected.
 *  @return [List] The property list repeats (X) times the value inside
 *  the { }.
 */
fun playersList(playersCount: Int): List<Player> {
    println("Create the $playersCount players.")
    return List(playersCount) { createPlayer() }
}

/**
 * Ask the user the number of players, if is not in the range of numbers
 * ask again.
 * @return [playersList] Execute the procedure playerList(), with
 * the parameter playersCount
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