package game.model

class Board(val squares: MutableList<MutableList<Square>> = MutableList(10){MutableList(10){Square()}}){
    fun setSnakes() {
        squares[1][5] = SnakeSquare(listOf(0,5))
        squares[4][5] = SnakeSquare(listOf(2,4))
        squares[4][8] = SnakeSquare(listOf(1,0))
        squares[6][1] = SnakeSquare(listOf(1,8))
        squares[6][3] = SnakeSquare(listOf(5,9))
        squares[7][3] = SnakeSquare(listOf(5,2))
        squares[8][8] = SnakeSquare(listOf(6,7))
        squares[9][1] = SnakeSquare(listOf(8,7))
        squares[9][4] = SnakeSquare(listOf(7,4))
        squares[9][8] = SnakeSquare(listOf(7,9))
    }
    fun setStairs() {
        squares[0][1] = StairSquare(listOf(3,7))
        squares[0][6] = StairSquare(listOf(1,3))
        squares[0][7] = StairSquare(listOf(3,0))
        squares[1][4] = StairSquare(listOf(2,5))
        squares[2][0] = StairSquare(listOf(4,1))
        squares[2][7] = StairSquare(listOf(8,3))
        squares[3][5] = StairSquare(listOf(4,3))
        squares[5][0] = StairSquare(listOf(6,6))
        squares[7][0] = StairSquare(listOf(9,0))
        squares[7][7] = StairSquare(listOf(9,7))
        squares[8][6] = StairSquare(listOf(9,3))
    }

    fun setPlayerInPositions(position: List<Int>, player: Player) {
        squares[position[0]][position[1]].playersIn.add(player)
    }

    override fun toString(): String {
        return "Board(squares=$squares)"
    }
}