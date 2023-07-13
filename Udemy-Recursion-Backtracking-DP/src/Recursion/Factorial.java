package Recursion;

public class Factorial {
    public int factHead(int n) {
        if (n==1) {
            System.out.println("Base case");
            return 1;
        }
        System.out.println("Before recursion: n="+n);
        int res =  n * factHead(n-1);
        System.out.println("After recursion: res="+res);
        return res;
    }

    public int factTail(int n, int acc) {
        if (n==1) {
            System.out.println("Base case: res="+acc);
            return acc;
        }
        System.out.println("Before recursion: n="+n);
        int res =  factTail(n-1, n*acc);
        System.out.println("After recursion: res="+res);
        return res;
    }
}
