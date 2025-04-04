package weekOne

import org.example.weekOne.ValidSudoku
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class ValidSudokuTest {

    private val validSudoku = ValidSudoku()

    @Test
    fun `isValidSudoku should return true for a valid sudoku`() {
        val board = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        assertTrue(validSudoku.isValidSudoku(board))
    }

    @Test
    fun `isValidSudoku should return false for an invalid Sudoku board (duplicate in column)`() {
        val board = arrayOf(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        assertFalse(validSudoku.isValidSudoku(board))
    }

    @Test
    fun `isValidSudoku should return false for an invalid Sudoku board (duplicate in row)`() {
        val board = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '8', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '4', '.', '.', '.', '.', '4', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        assertFalse(validSudoku.isValidSudoku(board))
    }

    @Test
    fun `isValidSudoku should return false for an invalid Sudoku board (duplicate in subgrid)`() {
        val board = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '8', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('4', '.', '.', '.', '8', '.', '.', '7', '9')
        )
        assertFalse(validSudoku.isValidSudoku(board))
    }

    @Test
    fun `isValidSudoku should return true for a valid 16x16 Sudoku board`() {
        val board: Array<CharArray> = arrayOf(
            charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
            charArrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
            charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
            charArrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),
            charArrayOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
            charArrayOf('6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3'),
            charArrayOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
            charArrayOf('E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B'),
            charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
            charArrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
            charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
            charArrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),
            charArrayOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
            charArrayOf('8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1'),
            charArrayOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
            charArrayOf('G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9')
        )
        assertTrue(validSudoku.isValidSudoku(board))
    }

    @Test
    fun `isValidSudoku should return false for an invalid 16x16 Sudoku board (duplicate in column)`() {
        val board = arrayOf(
            charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
            charArrayOf('M', 'F', 'E', 'D', 'C', 'B', 'A', '9', '8', '7', '6', '5', '4', '3', '2', 'F'),//F
            charArrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
            charArrayOf('E', 'D', 'G', 'F', 'A', '9', 'C', 'B', '1', '2', '5', '4', '8', '7', '3', 'F'),
            charArrayOf('5', '6', '7', '8', '1', '2', '3', '4', 'C', 'D', 'E', 'F', '9', 'A', 'B', '1'),
            charArrayOf('B', 'A', '9', 'C', 'G', 'F', 'E', 'D', '5', '6', '7', '8', '1', '2', '4', '2'),
            charArrayOf('7', '8', '5', '6', '3', '4', '1', '2', 'F', 'G', 'A', 'B', 'E', 'D', '9', '3'),
            charArrayOf('4', '3', 'B', 'A', '8', '7', 'G', 'F', '2', '1', 'D', 'C', '6', '5', 'E', '4'),
            charArrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '5'),
            charArrayOf('8', '7', '6', '5', '4', '3', '2', '1', 'G', 'F', 'E', 'D', 'C', 'B', 'A', '6'),
            charArrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '7'),
            charArrayOf('6', '5', 'E', 'D', '8', '7', '3', '6', 'E', 'D', 'G', 'F', 'A', '9', 'C', '8'),
            charArrayOf('C', 'D', 'E', 'F', '9', 'A', 'B', 'G', '5', '6', '7', '8', '1', '2', '3', '9'),
            charArrayOf('A', '9', 'C', 'B', '1', '2', '4', '3', 'B', 'A', '9', 'C', 'G', 'F', 'E', 'A'),
            charArrayOf('F', 'G', 'A', 'B', 'E', 'D', '9', 'C', '7', '8', '5', '6', '3', '4', '1', 'B'),
            charArrayOf('D', 'E', '9', 'C', '6', '5', 'E', '9', '4', '3', 'B', 'A', '8', '7', 'G', 'F')
        )
        assertFalse(validSudoku.isValidSudoku(board))
    }



}