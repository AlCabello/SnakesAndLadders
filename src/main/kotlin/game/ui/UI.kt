package game.ui

import game.model.Board
import game.model.Dice
import game.model.Player
import java.util.*


fun createGame(){
    val board = createBoard()
    println(board.toString())

    val dice = Dice()
    //println(dice.randomNum())

    val listPlayers = countPlayers()
    //println(listPlayers)

    listPlayers.forEach(){
        board.setPlayerInPositions(listOf(0,0),it)
    }
    println(board.toString())
}



fun createPlayer():Player{
    println("Give me the name of the new player.")
    val name = Scanner(System.`in`).next()
    println("Player $name created.")
    return Player(name)
}

fun playersList(playersCount: Int): List<Player>{
    println("Create the $playersCount players.")
    return List(playersCount){createPlayer()}
}

fun countPlayers(): List<Player> {
    println("How many players will you be? [2/3/4].")
    val playersCount = Scanner(System.`in`).nextInt()
    if(playersCount !in 2..4){
        println("ERROR, try again.")
        return countPlayers()
    }else
        return playersList(playersCount)
}


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

/**
 * The main of the application.
 */
fun main() {
    createGame()

}