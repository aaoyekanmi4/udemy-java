package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        makeSubsets(new ArrayList<>(), solution, nums, 0);
        return solution;
    }

    private void makeSubsets(List<Integer> current, List<List<Integer>> solution,
                             int[] nums, int idx) {
        solution.add(new ArrayList<>(current));
        for (int i = idx; i < nums.length; i++) {
            current.add(nums[i]);
            makeSubsets(current, solution, nums, i+1);
            current.remove(current.size() - 1);
        }
        return;
    }
}
