package DynammicProgramming;

// max profit for cutting rod into various pieces with price per piece
// unbounded knapsack because you can take more than 1 of the same piece.

public class RodCutting {
    private int[][] table;
    private int[] prices;
    private int totalLength;

    public RodCutting(int[] prices,  int totalLength) {
        this.prices = prices;
        this.totalLength = totalLength;
        this.table = new int[prices.length][totalLength+1];
    }

    public void solve() {
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j < totalLength+1; j++) {
                if (i <= j ) {
                    table[i][j] = Math.max(table[i-1][j], prices[i] + table[i][j-i] );
                } else {
                    table[i][j] = table[i-1][j];
                }
            }
        }
    }

    public void printResult () {
        System.out.println("Max total: $" + table[prices.length-1][totalLength]);
        for (int i = prices.length -1, j = totalLength; i > 0;) {
            if (table[i][j] != 0 && table[i][j] != table[i-1][j]) {
                System.out.println("Used rod piece # " + i);
                j -= i;
            } else {
                i--;
            }
        }
    }
}
