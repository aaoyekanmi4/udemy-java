package Backtracking;

public class Sudoku {
    private int [][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public void solveProblem(){
        if (solve(0,0)) {
            showSolution();
        } else {
            System.out.println("There is no solution");
        }
    }

    private boolean solve(int rowIndex, int colIndex) {
        if (rowIndex == Constants.BOARD_SIZE){
            colIndex++;
            if (colIndex == Constants.BOARD_SIZE){
                return true;
            } else {
                rowIndex=0;
            }
            //skip filled cells
        }
        if (sudokuTable[rowIndex][colIndex] != 0) {
            return (solve(rowIndex + 1, colIndex));
        }

        for (int i = Constants.MIN_NUMBER; i <= Constants.MAX_NUMBER; i++) {
            if (isValid(rowIndex, colIndex, i)) {
                sudokuTable[rowIndex][colIndex] = i;

                if (solve(rowIndex + 1, colIndex)) {
                    return true;
                }

                //Backtrack
                sudokuTable[rowIndex][colIndex] = 0;
            }
        }
        return false;
    }

    private boolean isValid(int rowIndex, int colIndex, int num) {
        // check if number already in column
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            if (sudokuTable[i][colIndex] == num) {
                return false;
            }
        }
        //check if number already in row
        for (int j = 0; j < Constants.BOARD_SIZE; j++) {
            if (sudokuTable[rowIndex][j] == num) {
                return false;
            }
        }

        int boxRowOffset = (rowIndex / 3) * Constants.BOX_SIZE;
        int boxColumnOffset = (colIndex / 3) * Constants.BOX_SIZE;

        for (int i = 0; i < Constants.BOX_SIZE; ++i) {
            for (int j = 0; j < Constants.BOX_SIZE; ++j) {
                if (sudokuTable[i + boxRowOffset][j + boxColumnOffset] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private void showSolution(){
        for (int i = 0; i < Constants.BOARD_SIZE; ++i) {
            if (i % 3 == 0) System.out.println();
            for (int j = 0; j < Constants.BOARD_SIZE; ++j) {
                if (j % 3 == 0) System.out.print(" ");
                System.out.print(sudokuTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
