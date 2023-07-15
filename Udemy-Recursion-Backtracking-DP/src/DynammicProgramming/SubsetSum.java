package DynammicProgramming;


//find boolean if you can add to the target with the given set of number
// 0-1 can either use the number once or not at all
public class SubsetSum {
    private boolean[][] table;
    private int sum;
    private int[] nums;

    public SubsetSum(int sum, int[] nums) {
        this.sum = sum;
        this.nums = nums;
        this.table = new boolean[nums.length + 1][sum +1];
    }

    public void solve() {
        // initialize first column to true
        // signifying we can always sum to 0
        for (int i = 0; i < nums.length; i++) {
            table[i][0] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j <= sum; j++) {
                //if the value in this column at the row above is true this is also true
                if (table[i-1][j]) {
                    table[i][j] = table[i-1][j];
                } else {
                    //if can't sum with current number (out of bounds) also take value from row above
                    if (j - nums[i-1] <0) {
                        table[i][j] = table[i-1][j];
                    } else {
                        // taking current number, take whatever the value is with the difference of current
                        // amount and the current number from the row above.
                        // example if amount 5, and  current 3, previous row val 2
                        // take boolean where col 2 and val is 2;w
                        table[i][j] = table[i-1][j-nums[i-1]];
                    }
                }
            }
        }
    }

    public void printResult() {
        System.out.println("The result is : " + table[nums.length][sum]);

        if (!table[nums.length][sum]) {
            return;
        }

        int colIndex = this.sum;
        int rowIndex = this.nums.length;

        while (rowIndex > 0 || colIndex > 0) {
            if (table[rowIndex][colIndex] == table[rowIndex -1][colIndex]) {
                rowIndex = rowIndex -1;
            } else {
                System.out.println("We take item: "+ nums[rowIndex -1]);
                colIndex = colIndex - nums[rowIndex -1];
                rowIndex = rowIndex -1;
            }
        }
    }
}
