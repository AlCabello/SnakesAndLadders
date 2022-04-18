package game.objects

data class SnakesAndLadders (val board: Board, val dice: Dice, val PlayersList: List<Player>){

    fun move(player: Player) {
        val movement = dice.rollDice(player)
        val position =  whereIsPlayer(player)

        if (board.chekLimit(movement,position))
            board.move(movement, player,position)

        board.specialSquares(movement+position, player)

    }

    fun whereIsPlayer(player: Player): Int{
        var position = 0
        for (i in 0..board.squares.lastIndex){
            if (player in board.squares[i].playersIn)
                position = i
        }
        return position
    }

    fun play(): String {
        while(true){
            PlayersList.forEach(){
                move(it)
                if(it in board.squares[99].playersIn)
                    return "The winner is ${it.name}"
            }
        }

    }
}