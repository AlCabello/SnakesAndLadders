package game.code

import game.objects.Board

/**
 * Create the val board, is a default object of the class Board.
 * Add the special squares with the functions in Board class.
 * @return[Board] Return the new board.
 */
fun createBoard(): Board {
    val board = Board()
    board.setSnakes()
    board.setStairs()
    return board
}