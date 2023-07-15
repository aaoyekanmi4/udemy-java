package DynammicProgramming;

public class KnapSack01 {
    // the table to store maximal value for each items in range n and weights
    private int[][] S;
    // total weight capacity of sack
    private int capacity;
    // weight of each item
    private int[] weights;
    // how much each item is worth
    private int[] values;

    private int n;

    // 0-1 Knapsack maximum profit in taking items of different weights with a max capcity
    // can either take the item or not.
    public KnapSack01(int[][] s, int capacity, int[] weights, int[] values, int n) {
        S = s;
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.n = n;
    }

    public void solve() {
        // would initialize values of weights and values but they are 0 by default in Java

        //time complexity(O(n*m) items * capacity
        //making the table
        for (int i = 1; i <n+1; i++) {
            for (int j=1; j< capacity+1; j++) {
                //whether to take item or not
                int includingItem = 0;
                if (weights[i] <= j) {
                    includingItem = values[i] + S[i-1][j -weights[i]];
                }
                int excludingItem = S[i-1][j];

                S[i][j] = Math.max(includingItem, excludingItem);
            }
        }
        printResult();
    }

    private void  printResult() {
        System.out.println("Total value: " + S[n][capacity]);
        for (int i = n,  j = capacity; i >0; i--) {
            if (S[i][j] != 0 && S[i][j] != S[i-1][j]) {
                System.out.println("We take item #" + i);
                j = j - weights[i];
            }
        }

    }
}
