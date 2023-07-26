package InterviewQuestions;

public class TrappingRainWater {

    private int[] heights;

    private int[] maxLeftValues;
    private int[] maxRightValues;

    public TrappingRainWater(int[] heights) {
        this.heights = heights;
        this.maxLeftValues = new int[heights.length];
        this.maxRightValues = new int[heights.length];
    }

    // O(n) space O(n) memory solution
    public int solve() {
        if (heights.length < 3) return 0;
        
        int currentMax = 0;
        // initializing the value to the furthest left to be 0
        maxLeftValues[0] = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i -1] > currentMax) {
                currentMax = heights[i-1];
            }
            maxLeftValues[i] = currentMax;
        }

        currentMax = 0;
        // initializing the value to the furthest right to be 0
        maxRightValues[maxRightValues.length -1] = 0;
        for (int i = maxRightValues.length -2; i>=0 ; i--) {
            if (heights[i +1] > currentMax) {
                currentMax = heights[i+1];
            }
            maxRightValues[i] = currentMax;
        }

        // checking for the amount of water that can be trapped at each index
        int trappedWater = 0;
        for (int i = 0; i < heights.length; i++) {
            int possibleTrapAmount = Math.min(maxLeftValues[i], maxRightValues[i]) - heights[i];
            if (possibleTrapAmount >= 0) {
                trappedWater += possibleTrapAmount;
            } else {
                continue;
            }
        }
        return trappedWater;
    }

    //space optimized, 2 pointer approach
    public int solve2Pointer() {
        int trappedWater = 0;
        int currentMaxLeft = 0;
        int currentMaxRight = 0;
        for (int i = 0; i < heights.length; i++) {
            if (i > 1) {
                currentMaxLeft = heights[i-1] > currentMaxLeft ? heights[i-1]: currentMaxLeft;
            }
            if (i < heights.length -1) {
                currentMaxRight = heights[i+1] > currentMaxRight ? heights[i+1] : currentMaxRight;
            }
            int possibleTrapAmount = Math.min(currentMaxLeft, currentMaxRight) - heights[i];
            if (possibleTrapAmount >= 0) {
                trappedWater += possibleTrapAmount;
            } else {
                continue;
            }
        }
        return trappedWater;
    }
}
