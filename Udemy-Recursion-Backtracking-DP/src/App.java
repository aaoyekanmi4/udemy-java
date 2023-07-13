import Backtracking.LetterCombinationsOfPhone;
import Backtracking.NQueens;
import Backtracking.Permutations;
import Recursion.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
//        Fibonacci fib = new Fibonacci();
//        int result = fib.fibTail(5, 0, 1);
//        System.out.println(result);
//        List<Integer> iterationResult = fib.iteration(5);
//        System.out.println(iterationResult);

//        TowersOfHanoi towers = new TowersOfHanoi();
//        towers.solve(2, 'A', 'B', 'C');

        ReverseString reverseString = new ReverseString();
        String reversed = reverseString.reverse("Hello");
        System.out.println(reversed);

        String reversedWithTail = reverseString.reverseTail("Hello", "");
        System.out.println(reversedWithTail);

        EuclideanGCD gcd = new EuclideanGCD();

        int result = gcd.solve(496, 160);
        int iterativeResult = gcd.solveIterative(496, 160);
        System.out.println(result);
        System.out.println(iterativeResult);

        BinarySearch binarySearch = new BinarySearch();
        int[] nums = new int[]{1,3,4,5,6,12,16,22,38,55,64};
        int idx = binarySearch.find(nums, 38, 0, nums.length-1);
        System.out.println(idx);

        NQueens nQueens = new NQueens(4);
        nQueens.solve();

        Permutations problem = new Permutations();
        System.out.println(problem.solve(new int[]{1,2,3}));

        LetterCombinationsOfPhone phoneCombo = new LetterCombinationsOfPhone();
        System.out.println(phoneCombo.getCombos("23"));
    }
}
