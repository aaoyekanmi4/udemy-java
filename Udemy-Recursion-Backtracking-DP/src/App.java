import ArrayProblems.TemperatureAboveAverage;
import Backtracking.Permutations;
import Backtracking.Sudoku;
import BinPacking.FirstFitDecreasingAlgorithm;
import BitManipulation.CountingBits;
import BitManipulation.EvenOdd;
import InterviewQuestions.SortThree;
import InterviewQuestions.TrappingRainWater;
import LinkedLists.SinglyLinkedList;
import MasterMind.FourNumberGame;
import MasterMind.FullGame;
import Selection.QuickSelect;
import Helpers.ConsoleIO;
import java.util.Arrays;
import java.util.List;

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
//
//        int[] nums = {3,4,5};
//        int sum = 9;
//        SubsetSum problem = new SubsetSum(sum, nums);
//        problem.solve();
//        problem.printResult();

//        IncreasingIntervals increasingIntervals = new IncreasingIntervals();
//        int result = increasingIntervals.getIntervals(List.of(2,3,5,7,8), 3);
//        System.out.println(result);
//        int[][] adjacencyMatrix = {{0,1,0,0,0,1},
//                {1,0,1,0,0,0},
//                {0,1,0,0,1,0},
//                {0,0,0,0,1,1},
//                {0,0,1,1,0,1},
//                {1,0,0,1,1,0}};
//        HamiltonianCycle problem = new HamiltonianCycle(adjacencyMatrix);
//        problem.solve();

//        LongestCommonSubsequence lcs = new LongestCommonSubsequence("ambulance", "turbulence");
//        System.out.println(lcs.solve());
//
//        Subsets subsets = new Subsets();
//        System.out.println( subsets.solve(new int[] {1,2,3}));
//
//        int[][] mazeTable = {{1, 1, 1, 1},
//                             {1,0,1,0},
//                             {0,0,1,1},
//                             {1, 0, 1, 1}};
//
//            Maze problem = new Maze(mazeTable);
//            problem.solve();

//        ReverseInteger reverseInteger = new ReverseInteger();
//        System.out.println(reverseInteger.reverseInt(4321));

//        IsPrime primeChecker = new IsPrime();
//        List<Integer> primes = primeChecker.collectPrimes(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
//        System.out.println(primes);
//        Map<Integer, Integer> table = new HashMap<>();
//        table.put(0,0);
//        table.put(1,1);
//        Fib1000thDigit fib1000thDigit = new Fib1000thDigit();
//        System.out.println(fib1000thDigit.fibTab());
//
//        EggDrop eggDrop = new EggDrop(2, 100);
//        int result =  eggDrop.solve();
//        System.out.println(result);

//        SortThree sortThree = new SortThree();
//        int[] result = sortThree.solve(new int[]{0,2,2,2,1,1,1,2,2,2,1,1,0,0,0,2,2,2});
//        System.out.println(Arrays.toString(result));

//        TrappingRainWater trappingRainWater = new TrappingRainWater(new int[]{1,0,6,1,3,1,2,0,3});
//        int result = trappingRainWater.solve2Pointer();
//        int result2 = trappingRainWater.solve();
//        System.out.println(result);
//        System.out.println(result2);

//        QuickSelect quickSelect = new QuickSelect(new int[] {6,3,5,7,3,1,4,5,6,9,11,4,2});
//        int[]go result = quickSelect.sort();
//        System.out.println(Arrays.toString(result));

//        CountingBits countingBits = new CountingBits();
////        countingBits.countBits(120);

//        EvenOdd evenOdd = new EvenOdd();
//        evenOdd.check(128278);

//        List<Integer> items = Arrays.asList(3,2,4);
//        int binCapcity = 10;
//
//        FirstFitDecreasingAlgorithm algo = new FirstFitDecreasingAlgorithm(items, binCapcity);
//        algo.solve();
//        algo.showResults();
//        int [][] sudokuTable = {{0,0,7,5,0,0,0,1,3},
//                                {4,0,5,0,0,0,6,0,9},
//                                {6,0,0,0,0,2,0,0,0},
//                                {7,0,0,6,1,0,0,0,0},
//                                {0,0,3,0,0,0,1,0,0},
//                                {0,0,0,0,2,7,0,6,4},
//                                {8,1,0,2,5,3,7,0,6},
//                                {5,7,0,9,6,0,4,3,8},
//                                {3,9,0,0,0,4,0,0,0},
//                                };
//        Sudoku sudoku = new Sudoku(sudokuTable);
//        sudoku.solveProblem();
//
//        ConsoleIO io = new ConsoleIO();
//        int tempLength = io.readInt("How many days' temperature? ");
//        ArrayProblems.TemperatureAboveAverage temperatureAboveAverage = new TemperatureAboveAverage(tempLength);
//        temperatureAboveAverage.runProgram();

//        SinglyLinkedList sLL = new SinglyLinkedList();
//        sLL.createSinglyLinkedList(5);
//        sLL.insertNode(6,0);
//        sLL.insertNode(7,1);
//        sLL.traverse();
//        sLL.search(7);

//        Permutations permute = new Permutations();
//        System.out.println(permute.solve(new int[]{1,2,3,4}));

        FullGame masterMindGame = new FullGame();
        masterMindGame.runGame();
    }
}
