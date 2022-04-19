package game.objects

data class SnakesAndLadders(val board: Board, val dice: Dice, val PlayersList: List<Player>) {
    /**
     *
     */
    fun move(player: Player) {

        val position = board.whereIsPlayer(player)
        val movement = dice.rollDice(player, position)
        board.specialSquares(movement + position, player)
    }

    /**
     *
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