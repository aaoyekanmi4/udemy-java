package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        makePermutations(new ArrayList<>(), solution, nums);
        return solution;
    }

    private void makePermutations(List<Integer> current, List<List<Integer>> solution,
                                  int[] nums) {
        if (current.size() == nums.length) {
            solution.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) {
                current.add(nums[i]);
                makePermutations(current, solution, nums);
                current.remove(current.size() - 1);
            }
        }
        return;
    }
}
