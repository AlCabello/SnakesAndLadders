package game.code

import game.objects.Dice
import game.objects.SnakesAndLadders


fun createGame(): SnakesAndLadders {
    val board = createBoard()
    val dice = Dice()
    val listPlayers = countPlayers()
    listPlayers.forEach{
        board.setPlayerInPositions(listOf(0, 0), it)
    }
    return SnakesAndLadders(board,dice,listPlayers)
}

/**
 * The main of the application.
 */
fun main() {
    val game : SnakesAndLadders = createGame()
}