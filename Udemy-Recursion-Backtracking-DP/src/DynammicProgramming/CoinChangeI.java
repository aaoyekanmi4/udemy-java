package DynammicProgramming;

import java.util.Arrays;

// return the fewest number of coins to make an amount
public class CoinChangeI {
    public int solve (int[] coins, int amount) {
        // using amount + 1 to account for 0;
        int initialVal = 1 + amount;
        int[] dp = new int[initialVal];

        //initializing dp with amount + 1; it cannot take that many coins to add up to that value at index
        Arrays.fill(dp, initialVal);

        // no coins can make 0
        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < coins.length; j++) {
                if (i- coins[j] >= 0 ) {
                    // recursive relation: the current index will equal the minimum of what's there or
                    // 1 plus the amount of coins it took to make the minimum of the difference of the current
                    // amount and current coin
                    dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
                }
            }
        }
        return dp[amount] == initialVal  ? -1 : dp[amount];
    }
}
