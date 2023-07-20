package Backtracking;

// given a number of queens return a placements of n-queens on n sized board where they are not attacking each other
public class NQueens {
    private int[][] chessBoard;
    private int numOfQueens;

    public NQueens(int numOfQueens) {
        this.numOfQueens = numOfQueens;
        this.chessBoard = new int[numOfQueens][numOfQueens];
    }

    public void solve() {
        // start solving the problem starting with the first column
        // another interpretation: start placing the queens starting with index 0
        if (setQueen(0)) {
            printQueens();
        } else {
            System.out.println("There is no solution...");
        }
    }

    private boolean setQueen(int colIdx) {
        // ex: n = 4
        // have placed 0, 1, 2, 3
        // if we get to 4 we have found the solution for the four queens
        // it means we have found the location for N queens (problem solved)
        if (colIdx == numOfQueens) return true;

        //consider all possible rows a queen could be placed in the col
        for (int rowIdx= 0; rowIdx < chessBoard.length; rowIdx++) {

            if(isPlaceValid(rowIdx, colIdx)) {

                // if valid place the queen at the row col
                chessBoard[rowIdx][colIdx] = 1;

                // solve problem for next column
                if (setQueen(colIdx +1)) return true;

                // backtrack
                chessBoard[rowIdx][colIdx] = 0;
            }
        }
        //cannot find a valid row for this queen we have to change
        // the position of already settled queens
        return false;
    }

    private boolean isPlaceValid(int rowIdx, int colIdx) {
        //there cannot be other queens in the same row
        for (int i = 0; i < colIdx; i++) {
            if (chessBoard[rowIdx][i] == 1) {
                return false;
            }
        }

        // checking diagonals to the left because no queens can be on the right
        // diagonal from placed queen to upper left
        for (int i = rowIdx, j = colIdx; i >= 0 && j>=0; i--, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }

        //diagonal from placed queen to bottom left
        for (int i = rowIdx, j = colIdx; i < chessBoard.length && j >=0; i++, j--) {
            if (chessBoard[i][j] == 1) {
                return false;
            }
        }
        return true;
        // we do not have to check the columns because we are placing 1 queen per column
    }

    private void printQueens() {
        // 1 represents queen
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j <chessBoard.length; j++) {
                if (chessBoard[i][j] == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
