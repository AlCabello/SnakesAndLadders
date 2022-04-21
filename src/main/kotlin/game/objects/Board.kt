package game.objects

class Board(val squares: MutableList<Square> = MutableList(100) { Square() }) {
    /**
     * The snakes in the real game have random positions, then we need
     * to put it manually.
     * This procedure converts the selected squares, in the object
     * SnakeSquare, with a number inside, this numbers is the number
     * of the pointed square.
     */
    fun setSnakes() {
        squares[15] = SnakeSquare(5)
        squares[45] = SnakeSquare(25)
        squares[48] = SnakeSquare(10)
        squares[61] = SnakeSquare(18)
        squares[63] = SnakeSquare(59)
        squares[73] = SnakeSquare(52)
        squares[88] = SnakeSquare(67)
        squares[91] = SnakeSquare(87)
        squares[94] = SnakeSquare(74)
        squares[98] = SnakeSquare(79)
    }

    /**
     * The stairs in the real game have random positions, then we need
     * to put it manually.
     * This procedure converts the selected squares, in the object
     * StairSquare, with a number inside, this numbers is the number
     * of the pointed square.
     */
    fun setStairs() {
        squares[1] = StairSquare(37)
        squares[6] = StairSquare(13)
        squares[7] = StairSquare(30)
        squares[14] = StairSquare(25)
        squares[20] = StairSquare(41)
        squares[27] = StairSquare(83)
        squares[35] = StairSquare(43)
        squares[50] = StairSquare(66)
        squares[70] = StairSquare(90)
        squares[77] = StairSquare(97)
        squares[86] = StairSquare(93)
    }

    /**
     *
     */
    fun setPlayerInPositions(position: Int, player: Player) {
        println("${player.name} your new position is ${position + 1}")
        squares[position].playersIn.add(player)
    }

    /**
     *
     */
    fun whereIsPlayer(player: Player): Int {
        var position = 0
        for (i in 0..squares.lastIndex) {
            if (player in squares[i].playersIn)
                position = i
        }
        return position
    }

    /**
     *
     */
    fun move(movement: Int, player: Player, position: Int) {
        squares[position].playersIn.remove(player)
        setPlayerInPositions(movement + position, player)
    }

    /**
     *
     */
    fun specialSquares(newPosition: Int, player: Player) {
        if (squares[newPosition] is SnakeSquare || squares[newPosition] is StairSquare) {
            squares[newPosition].go()
            move(squares[newPosition].goTo - newPosition, player, newPosition)
        }
    }
}