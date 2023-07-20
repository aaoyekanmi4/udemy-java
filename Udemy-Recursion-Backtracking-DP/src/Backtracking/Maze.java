package Backtracking;

public class Maze {
    private int[][] maze;
    private int[][] solution;
    private int mazeSize;

    public Maze(int[][] maze) {
        this.maze = maze;
        this.mazeSize = maze.length;
        this.solution = new int[mazeSize][mazeSize];

    }

    public void solve(){
       if( findSolution(0,0)) {
           printResult();
       } else {
           System.out.println("There is no solution");
       }
    }

    private boolean findSolution(int rowIndex, int colIndex){
        if (isFinished(rowIndex, colIndex)) {
            return true;
        }
        if (isValid(rowIndex, colIndex)) {
            solution[rowIndex][colIndex] = 1;

            // moving horizontally to the right
            if (findSolution(rowIndex, colIndex +1)) {
                return true;
            }

            // moving downwards
            if (findSolution(rowIndex +1, colIndex)) {
                return true;
            }
            solution[rowIndex][colIndex] = 0;
        }
        return false;
    }

    private boolean isFinished(int rowIndex, int colIndex){
        //have reached bottom right corner
        if (rowIndex == mazeSize -1 && colIndex == mazeSize -1) {
            solution[rowIndex][colIndex] = 1;
            return true;
        }
        return false;
    }

    private boolean isValid(int rowIndex, int colIndex) {
        //out of bounds horizontally or vertically
        if (rowIndex < 0 || rowIndex >= mazeSize) return false;
        if (colIndex < 0 || colIndex >= mazeSize) return false;
        // it is an obstacle
        if (maze[rowIndex][colIndex] != 1) return false;
        return true;
    }

    public void printResult(){
        for (int i = 0; i < mazeSize; i++) {
            for (int j = 0; j < mazeSize; j++) {
                if (solution[i][j] == 1) {
                    System.out.print(" S ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }
}
