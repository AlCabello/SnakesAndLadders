package game.objects

/**
 *
 */
data class SnakesAndLadders(val board: Board, val dice: Dice, val PlayersList: List<Player>) {
    /**
     * This procedure moves the selected Player, first we need to
     * see the position of the player in the board, then we call
     * the dice to receive the number of movements, then we move
     * the user to the new position, in the last check with de function
     * specialSquares in the object board.
     */
    fun move(player: Player) {
        val position = board.whereIsPlayer(player)
        val movement = dice.rollDice(player, position)
        board.move(movement, player, position)
        board.specialSquares(movement + position, player)
    }

    /**
     * The function play is an infinite loop, it only ends when we do
     * the return, inside this loop, we go through the list of players,
     * in every player we do the procedure move, then we check if the
     * user is a winner, if the user is in the last position, then
     * we return 'The winner is WinnerPlayer'
     *
     * @return[String] We return the text of the victory.
     */
    fun play(): String {
        while (true) {
            PlayersList.forEach {
                move(it)
                if (it in board.squares[99].playersIn)
                    return "The winner is ${it.name}"
            }
        }
    }
}