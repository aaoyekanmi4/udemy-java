package DynammicProgramming;

public class EggDrop {
    private int numOfEggs;
    private int floors;
    private int[][] table;

    // returns the minimum number of floors needed to determine which floor an egg will break on with two eggs.
    public EggDrop(int numOfEggs, int floors) {
        this.numOfEggs = numOfEggs;
        this.floors = floors;
        this.table = new int[numOfEggs + 1][floors + 1];
    }

    public int solve() {
        // initialize first column to 1
        table[0][1] = 1;
        table[1][1] = 1;

        // initialize first row to value of column
        // represents the case where we only have one egg: will have to check every floor linearly
        for (int j = 1; j <= floors; j++) {
            table[1][j] = j;
        }
        // since n is always 2 number of eggs hardcoding 2.
        // j represents total floors
            for (int j = 1; j <= floors; j++) {
                // initializing column to max value
                table[2][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    // table[1][x-1] is the number of drops if the egg breaks
                    // table[2][j-x] is the number of drops if the egg does not break this time
                    // adding one to indicate we just made a drop
                    // taking max because we are dealing with worst case scenario between breaking and not
                    int maxDrops = 1 + Math.max(table[1][x - 1], table[2][j - x]);
                    // taking minimum because we are looking for least number of drops
                    if (maxDrops < table[2][j]) {
                        table[2][j] = maxDrops;
                    }
                }
            }
        return table[numOfEggs][floors];
    }
}
