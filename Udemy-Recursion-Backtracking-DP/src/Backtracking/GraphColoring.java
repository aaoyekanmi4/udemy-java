package Backtracking;

// must not color adjacent nodes with same color
public class GraphColoring {

        private int numOfVertices;
        private int numOfColors;
        private int[] colors;
        private int[][] graph;

        public GraphColoring(int[][] graph, int numOfColors) {
            this.numOfColors = numOfColors;
            this.numOfVertices = graph[0].length;
            this.colors = new int[numOfVertices];
            this.graph = graph;
        }

        public boolean solve() {
            if(solveProblem(0)) {
                showSolution();
                return true;
            } else {
                System.out.println("There is no solution with these parameters...");
                return false;
            }
        }

        private boolean solveProblem(int nodeIndex) {
            //base case
            if (nodeIndex == numOfVertices) {
                return true;
            }

            // your implementation here with backtracking
            for (int i = 1; i <= numOfColors; i++) {
                if (isColorValid(nodeIndex, i)) {
                    colors[nodeIndex] = i;
                    if (solveProblem(nodeIndex + 1)) return true;
                }

                //backtracking
                //trying next color
            }
            return false;
        }

        private boolean isColorValid(int nodeIndex, int colorIndex) {
            // if the adjacent node has the same color then return false
            for(int i=0;i<numOfVertices;++i) {
                if (graph[nodeIndex][i] == 1 && colorIndex == colors[i]) {
                    return false;
                }
            }
            return true;
        }

        private void showSolution() {
            for(int i=0;i<colors.length;++i)
                System.out.println("Node: " + (i+1) + " has color index: " + colors[i]);
        }
}
