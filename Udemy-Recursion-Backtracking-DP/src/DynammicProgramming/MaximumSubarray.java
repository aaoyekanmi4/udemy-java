package DynammicProgramming;

import java.util.ArrayList;
import java.util.List;

// Kadane's algorithm. Given an array returns largest sum of integers in the array
public class MaximumSubarray {

    public void solve(int[] nums) {
        // take num at index 0 as initial max
        int globalMax = nums[0];
        int localMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);

            if (localMax > globalMax) {
                globalMax = localMax;
            }
        }
    }
}
