import Backtracking.LetterCombinationsOfPhone;
import Backtracking.NQueens;
import Backtracking.Permutations;
import DynammicProgramming.*;
import Recursion.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        FibonacciDP fibDP = new FibonacciDP();
//        Map<Integer, Integer> table = new HashMap<>();
//        table.put(0,0);
//        table.put(1,1);
//        int memoResult = fibDP.fibMemo(7, table);
//        int tabResult = fibDP.fibTab(7, table);
//        System.out.println(memoResult);
//        System.out.println(tabResult);
//
//        int n = 4;
//        int capacity = 8;
//        int[] weights = {0, 1, 3, 4, 5};
//        int[] values =  {0, 1, 4, 15,12};
//        int[][] S = new int[n+1][capacity+1];
//
//        KnapSack01 kp = new KnapSack01(S, capacity, weights, values, n);
//
//        kp.solve();

//        int totalLength = 5;
//        int[] prices = new int[]{0, 2, 5, 7 ,3, 9};
//
//        RodCutting problem = new RodCutting(prices, totalLength);
//        problem.solve();
//        problem.printResult();

//        CoinChangeI coinChangeI = new CoinChangeI();
//        int result = coinChangeI.solve(new int[]{1,2,5}, 11);
//        System.out.println(result);

//        CoinChangeII coinChangeII = new CoinChangeII(5,new int[]{1,2,5});
//       int result =  coinChangeII.solve();
//        System.out.println(result);

        int[] nums = {3,4,5};
        int sum = 9;
        SubsetSum problem = new SubsetSum(sum, nums);
        problem.solve();
        problem.printResult();

    }
}
