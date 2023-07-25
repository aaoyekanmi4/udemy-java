package InterviewQuestions;


// sorting an array of 0's, 1's, and 2's
// Dutch National Flag Problem
public class SortThree {
    public int[] solve(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length -1;
        // using the middle value as the pivot
        int mid = 1;

        while (j<=k) {
            if (nums[j] < mid) {
                swap(i,j, nums);
                i++;
                j++;
            } else if (nums[j] == mid) {
                j++;
            } else if (nums[j] > mid) {
                swap(j, k, nums);
                k--;
            }
        }
        return nums;
    }

    private void swap (int pos1, int pos2, int[] nums) {
        int temp = nums[pos1];
        nums[pos1]= nums[pos2];
        nums[pos2] = temp;
    }
}
