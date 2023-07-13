import Backtracking.LetterCombinationsOfPhone;
import Backtracking.NQueens;
import Backtracking.Permutations;
import DynammicProgramming.FibonacciDP;
import DynammicProgramming.KnapSack01;
import DynammicProgramming.RodCutting;
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

        int totalLength = 5;
        int[] prices = new int[]{0, 2, 5, 7 ,3, 9};

        RodCutting problem = new RodCutting(prices, totalLength);
        problem.solve();
        problem.printResult();
    }
}
