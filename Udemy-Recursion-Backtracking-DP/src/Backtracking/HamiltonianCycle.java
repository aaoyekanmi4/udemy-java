package Backtracking;

public class HamiltonianCycle {
    private int numberOfVertices;
    private int[][] solution;
    private int[] hamiltonianPath;
    private int[][] adjacencyMatrix;

    public HamiltonianCycle(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.numberOfVertices = adjacencyMatrix[0].length;
        this.hamiltonianPath = new int[numberOfVertices];
    }

    public void solve(){
        //we start with the first index (vertex 0)
        hamiltonianPath[0] = 0;
        if (findSolution(1)) {
            printResult();
        } else {
            System.out.println("There is no solution");
        }
    }

    private boolean findSolution(int position){
        //have considered all the verticies | base case
        if (position == numberOfVertices) {
            // means there is an edge between the last and first index of the hamiltonion path
            if (adjacencyMatrix[hamiltonianPath[position -1]][hamiltonianPath[0]] == 1) {
                // have found cycle
                return true;
            }
            return false;
        }

        for (int i = 1; i < numberOfVertices; i++) {
            if (isValid(i, position)) {
                hamiltonianPath[position] = i;
                if (findSolution(position + 1)) return true;
                //BACKTRACK!
                // here backtrack means do nothing - checking another vertex with the loop
            }
        }
        // have checked vertices without success
        return false;
    }

    private boolean isValid(int vertex, int position) {
        //first: are the two vertices connected? signified by a one in the adjacency matrix at the intersection
        if (adjacencyMatrix[hamiltonianPath[position -1]][vertex] == 0) {
            return false;
        }
        //second: position already in current hamilotonian path (has been visited)?
        for (int i = 0; i < position; i++) {
            if (hamiltonianPath[i] == vertex) {
                return false;
            }
        }
        return true;
    }

    private void printResult(){
        System.out.println("Hamiltonian cycle exists: ");
        for (int i =0; i < hamiltonianPath.length; i++) {
            System.out.print(hamiltonianPath[i] + " - ");

        }

        //print first item again to show cycle
        System.out.print(hamiltonianPath[0]);
    }
}
