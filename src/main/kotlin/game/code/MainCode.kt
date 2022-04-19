package game.code

import game.objects.Dice
import game.objects.SnakesAndLadders

/**
 * Create the object SnakesAndLadders, creating a new board, dice and a list of players.
 * @return[SnakesAndLadders]
 */
fun createGame(): SnakesAndLadders {
    val board = createBoard()
    val dice = Dice()
    val listPlayers = countPlayers()
    listPlayers.forEach {
        board.setPlayerInPositions(0, it)
    }
    return SnakesAndLadders(board, dice, listPlayers)
}

/**
 * The main of the application.
 * Create the game, object type SnakesAndLadders, with the function create game.
 * Execute the procedure play(), function of the object game.
 */
fun main() {
    val game: SnakesAndLadders = createGame()
    println(game.play())
}