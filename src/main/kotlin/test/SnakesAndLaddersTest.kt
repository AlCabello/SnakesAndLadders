package test

import game.objects.Board
import game.objects.Dice
import game.objects.Player
import game.objects.SnakesAndLadders
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


internal class SnakesAndLaddersTest {


    /**
     * When the game starts, the player is in the first square.
     *
     * We are going to pick the creating game function, we need to give her in the terminal the count of player,
     * 2 in the example, and the name of the players.
     * Then we check if the affirmation is true, the players are in the first square?
     */

    @Test
    fun US1_UAT1(){
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        assertEquals(testGame.board.squares[0].playersIn, testGame.playerList)
    }

    @Test
    fun US1_UAT2() {
        //Default settings.
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        //Locate the position, and we select the number of the dice, in this case 3.
        val position = testGame.board.whereIsPlayer(testGame.playerList[0])
        val movement = 3
        //We use the function move, to check if the movement is correct.
        testGame.board.move(movement, testGame.playerList[0], position)
        assertTrue(testGame.playerList[0] in testGame.board.squares[position+movement].playersIn)
    }

    @Test
    fun US1_UAT3() {
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        var position = testGame.board.whereIsPlayer(testGame.playerList[0])
        var movement = 3
        testGame.board.move(movement, testGame.playerList[0], position)

        //Research the position, and set the movement to 4.
        position = testGame.board.whereIsPlayer(testGame.playerList[0])
        movement = 4
        testGame.board.move(movement, testGame.playerList[0], position)
        //Check if the player is in the new position. The number is one position below because the
        //list starts counting in the number 0, but is the square number 8.
        assertTrue(testGame.playerList[0] in testGame.board.squares[7].playersIn)
    }

    @Test
    fun US2_UAT1() {
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        //Set the player in the position 97.
        var position = testGame.board.whereIsPlayer(testGame.playerList[0])
        var movement = 96
        testGame.board.move(movement, testGame.playerList[0], position)

        //Move the player 3 times.
        position = testGame.board.whereIsPlayer(testGame.playerList[0])
        movement = 3
        testGame.board.move(movement, testGame.playerList[0], position)
        //The game return this string if the player win, if the boolean below is true, the test is going to say correct.
        assertEquals("The winner is PlayerTest", testGame.play())
    }

    @Test
    fun US2_UAT2() {
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        //Set the player in the position 97.
        var position = testGame.board.whereIsPlayer(testGame.playerList[0])
        var movement = 96
        testGame.board.move(movement, testGame.playerList[0], position)

        //Move the player 4 times.
        position = testGame.board.whereIsPlayer(testGame.playerList[0])
        movement = 4
        testGame.board.move(movement, testGame.playerList[0], position)
        //We chek if the player stay in the position 97.
        assertTrue(testGame.playerList[0] in testGame.board.squares[96].playersIn)
    }

    @Test
    fun US3_UAT1() {
        //If the boolean below is true, when we do rollDice, the dice returns a
        // number in 1 to 6.
        val dice = Dice()
        assertTrue(dice.rollDice(Player("TestName"),0) in listOf(1,2,3,4,5,6))
    }
    @Test
    fun US3_UAT2() {
        val testGame = SnakesAndLadders(Board(), Dice(), mutableListOf(Player("PlayerTest")))
        testGame.setDefault()
        val position = testGame.board.whereIsPlayer(testGame.playerList[0])
        val movement = 4
        testGame.board.move(movement, testGame.playerList[0], position)
        assertEquals(testGame.playerList, testGame.board.squares[position+movement].playersIn)
    }
}