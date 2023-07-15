package DynammicProgramming;

import java.util.Arrays;

public class CoinChangeII {
    private int[][] table;
    private int [] coins;
    private int amount;

    // return the number of ways you can use the given coins to make an amount
    public CoinChangeII(int amount,int[] coins) {
        this.coins = coins;
        this.amount = amount;
        //using plus 1 to account for 0 place
        this.table = new int[coins.length+1][amount+1];
    }

    public int solve() {
        //initialize first column to 1
        for (int i = 0; i <= coins.length; i++) {
            table[i][0] = 1;
        }
        //always going to add the number of ways with the coin before
        // but if the coin value is less than the amount(column j), then will also add the number of ways
        // from that space in the table on the same row (line 30)'
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                table[i][j] = table[i-1][j];
                if (j - coins[i-1] >= 0) {
                    table[i][j] += table[i][j- coins[i-1]];
                }
            }
        }
        return table[coins.length][amount];
    }


//    public int solve(int amount, int[] coins) {
//        int n = coins.length;
//        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, 0);
//
//        // if amount is 0, there is only 1 way of making change (no money)
//        dp[0] = 1;
//
//        for (int coin : coins) {
//            for (int i = 1; i <= amount; i++) {
//                //if coin less than the current amount
//                if (coin <= i) {
//                    //
//                    dp[i] = dp[i] + dp[i - coin];
//                }
//            }
//        }
//        return dp[amount];
//    }
}
