package Recursion;

public class EuclideanGCD {
    public int solve(int larger, int smaller) {
        if (larger % smaller == 0) {
            return smaller;
        }
        return solve(smaller, larger % smaller);
    }

    public int solveIterative(int larger, int smaller) {
        while (larger % smaller != 0) {
            int temp = larger;
            larger = smaller;
            smaller = temp % smaller;
        }
        return smaller;
    }
}
