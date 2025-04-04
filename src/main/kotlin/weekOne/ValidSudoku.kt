package org.example.weekOne

class ValidSudoku {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for(i in board.indices) {
            for(j in board[i].indices) {
                if(board[i][j] != '.' && !isValid(i , j , board)) {
                    return false
                }
            }
        }
        return true
    }

    private fun isValid(row: Int, col: Int, board: Array<CharArray>) : Boolean {

        for(i in board.indices) {
            if(i == row)
                continue
            if(board[row][col] == board[i][col]) {
                return false
            }
        }

        for(j in board[0].indices) {
            if(j == col)
                continue
            if(board[row][col] == board[row][j]) {
                return false
            }
        }
        val subgridSize = Math.sqrt(board.size.toDouble()).toInt();
        val x = row - row%subgridSize
        val y = col - col%subgridSize

        for (i in x until x + subgridSize) {
            for (j in y until y + subgridSize) {
                if (i == row && j == col) {
                    continue
                }
                if (board[row][col] == board[i][j]) {
                    return false
                }
            }
        }
        return true
    }
}