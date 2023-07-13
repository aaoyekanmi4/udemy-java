package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public int fibHead(int n) {
        if (n==0 || n==1) {
            return n;
        }
        return fibHead(n-1) + fibHead(n-2);
    }

    public int fibTail(int n, int a, int b) {

        if (n==0) {
            return a;
        }
        if (n==1) {
            return b;
        }
        return fibTail(n-1,b, a+b);
    }

    public List<Integer> iteration(int n) {

        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        for (int i = 2; i <= n; i++) {
            nums.add(nums.get(i-1) + nums.get(i-2));
        }
        return nums;
    }
}
